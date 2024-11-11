package com.academico.models.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.academico.models.model.Aluno;
import com.academico.models.model.Professor;
import com.academico.models.model.Usuario;
import com.academico.models.repository.AlunoRepository;
import com.academico.models.repository.CidadeRepository;
import com.academico.models.repository.ProfessorRepository;
import com.academico.models.repository.UsuarioRepository;
import com.academico.models.service.UsuarioService;
import com.academico.models.service.dto.Converter.UsuarioConverter;
import com.academico.models.service.dto.request.UsuarioRequest;
import com.academico.models.service.dto.response.UsuarioResponse;
import com.academico.models.service.exception.EntityNotFoundException;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService { // Beans
	
	@Autowired // Cria a instância (monitora)
	private UsuarioRepository usuarioRepository; // Para gravação usa-se o repository
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private ProfessorRepository professorRepository;
	
	@Autowired
	private AlunoRepository alunoRepository;

	@Override
	public UsuarioResponse save(UsuarioRequest entity) {
		
		System.out.println(" * USUÁRIO REQUEST *" + entity.toString());
		
		var usuario = UsuarioConverter.toUsuario(entity);
		
		System.out.println(usuario.toString());
		
		var cidade = cidadeRepository.findById(entity.getCodigoCidade());
		
		System.out.println("Cidade: " + usuario.toString());
		
		usuario.setCidade(cidade.get());
	
		if (entity.getTipo() == 1) {
			Professor professor= new Professor();
			professor.setNomeProfessor(usuario.getNomeUsuario());
			professor.setCodProfessor(usuario.getCodUsuario());
			
			System.out.println(professor.toString());
			
			usuario.setProfessor(professor);
		}
		else {
			Aluno aluno = new Aluno();
			aluno.setCodAluno(usuario.getNomeUsuario());
			aluno.setNomeAluno(usuario.getNomeUsuario());
			aluno.setIdade(entity.getIdade());
			
			System.out.println(aluno.toString());
			
			usuario.setAluno(aluno);
		}
		
		usuario = usuarioRepository.saveAndFlush(usuario);
		var usuarioResponse = UsuarioConverter.toUsuarioResponse(usuario);
		return usuarioResponse; // Save and Flush retorna um objeto, entity é a própria usuario
	}

	@Override
	public UsuarioResponse update(Long id, UsuarioRequest entity) {
		var usuario = usuarioRepository.findById(id)
				.orElseThrow(
						()-> new EntityNotFoundException(
								String.format("Usuario não localizado %s", 
								String.valueOf(id))));
		
		
		usuario.setCodUsuario(entity.getCodUsuario());
		usuario.setNomeUsuario(entity.getNomeUsuario());
		
		if (entity.getTipo() == 1) {
			usuario.getProfessor().setCodProfessor(entity.getCodUsuario());
			usuario.getProfessor().setNomeProfessor(entity.getNomeUsuario());
		}
		else {
			usuario.getAluno().setCodAluno(entity.getCodUsuario());
			usuario.getAluno().setNomeAluno(entity.getNomeUsuario());
		}
		
		usuario = usuarioRepository.saveAndFlush(usuario);
		
		return UsuarioConverter.toUsuarioResponse(usuario);
		//return save(usuarioCadastrado);
	}

	@Override
	public void deleteById(Long id) {
		usuarioRepository.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public UsuarioResponse findById(Long id) {
		var usuario = usuarioRepository.findById(id).orElseThrow(()-> new EntityNotFoundException(
				String.format("Usuario não localizado %s", String.valueOf(id))));
		
		var usuarioResponse = UsuarioConverter.toUsuarioResponse(usuario);
		
		return usuarioResponse;
	}

}
