package com.academico.models.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.academico.models.model.Aluno;
import com.academico.models.repository.AlunoRepository;
import com.academico.models.service.AlunoService;
import com.academico.models.service.exception.EntityNotFoundException;

@Service
@Transactional
public class AlunoServiceImpl implements AlunoService { // Beans
	
	@Autowired // Cria a instância (monitora)
	private AlunoRepository alunoRepository; // Para gravação usa-se o repository

	@Override
	public Aluno save(Aluno entity) {
		return alunoRepository.saveAndFlush(entity); // Save and Flush retorna um objeto, entity é a própria aluno
	}

	@Override
	public Aluno update(Long id, Aluno entity) {
		var alunoCadastrado = findById(id);
		
		alunoCadastrado.setCodAluno(entity.getCodAluno());
		
		alunoCadastrado.setNomeAluno(entity.getNomeAluno());
		
		return save(alunoCadastrado);
	}

	@Override
	public void deleteById(Long id) {
		alunoRepository.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Aluno findById(Long id) {
		return alunoRepository.findById(id).orElseThrow(()-> new EntityNotFoundException(
				String.format("Aluno não localizado %s", String.valueOf(id))));
	}

}
