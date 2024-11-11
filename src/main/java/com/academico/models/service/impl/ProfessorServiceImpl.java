package com.academico.models.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.academico.models.model.Professor;
import com.academico.models.repository.ProfessorRepository;
import com.academico.models.service.ProfessorService;
import com.academico.models.service.exception.EntityNotFoundException;

@Service
@Transactional
public class ProfessorServiceImpl implements ProfessorService { // Beans
	
	@Autowired // Cria a instância (monitora)
	private ProfessorRepository professorRepository; // Para gravação usa-se o repository

	@Override
	public Professor save(Professor entity) {
		return professorRepository.saveAndFlush(entity); // Save and Flush retorna um objeto, entity é a própria professor
	}

	@Override
	public Professor update(Long id, Professor entity) {
		var professorCadastrado = findById(id);
		
		professorCadastrado.setCodProfessor(entity.getCodProfessor());
		
		professorCadastrado.setNomeProfessor(entity.getNomeProfessor());
		
		return save(professorCadastrado);
	}

	@Override
	public void deleteById(Long id) {
		professorRepository.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Professor findById(Long id) {
		return professorRepository.findById(id).orElseThrow(()-> new EntityNotFoundException(
				String.format("Professor não localizado %s", String.valueOf(id))));
	}

}
