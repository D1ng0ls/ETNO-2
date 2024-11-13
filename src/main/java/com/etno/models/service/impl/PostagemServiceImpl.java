package com.etno.models.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.etno.models.model.Evento;
import com.etno.models.model.Noticia;
import com.etno.models.repository.PostagemRepository;
import com.etno.models.repository.UsuarioRepository;
import com.etno.models.service.PostagemService;
import com.etno.models.service.dto.converter.PostagemConverter;
import com.etno.models.service.dto.request.PostagemRequest;
import com.etno.models.service.dto.response.PostagemResponse;
import com.etno.models.service.exception.EntityNotFoundException;

@Service
@Transactional
public class PostagemServiceImpl implements PostagemService{
	
	@Autowired
	private PostagemRepository postagemRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public PostagemResponse create(PostagemRequest entity) {
		var postagem = PostagemConverter.toPostagem(entity);
		
		var usuario = usuarioRepository.findById(entity.getCodUsuario());
		
		postagem.setUsuario(usuario.get());
		postagem.setTituloPostagem(entity.getTituloPostagem());
		postagem.setCodPostagem(entity.getCodPostagem());
		postagem.setDataPostagem(entity.getDataPostagem());
		postagem.setImagemPostagem(entity.getImagemPostagem());
		postagem.setUrlPostagem(entity.getUrlPostagem());
		
		if (entity.getTipoPostagem() == 1) {
			Evento evento= new Evento();
			evento.setCodEvento(postagem.getCodPostagem());
			
			postagem.setEvento(evento);
		}
		else {
			if (entity.getTipoPostagem() == 2) {
				Noticia noticia = new Noticia();
				noticia.setCodNoticia(postagem.getCodPostagem());
				
				postagem.setNoticia(noticia);
			}
		}

		postagem = postagemRepository.saveAndFlush(postagem);
		
		var postagemResponse = PostagemConverter.toPostagemResponse(postagem);
		return postagemResponse;
	}

	@Override
	public PostagemResponse update(Long id, PostagemRequest entity) {
		var postagem = postagemRepository.findById(id)
				.orElseThrow(
						()-> new EntityNotFoundException(
								String.format("Postagem não localizada %s", 
								String.valueOf(id))));
		
		postagem.setTituloPostagem(entity.getTituloPostagem());
		postagem.setCodPostagem(entity.getCodPostagem());
		postagem.setDataPostagem(entity.getDataPostagem());
		postagem.setImagemPostagem(entity.getImagemPostagem());
		postagem.setUrlPostagem(entity.getUrlPostagem());
		
		if (entity.getTipoPostagem() == 1) {
			Evento evento= new Evento();
			evento.setCodEvento(postagem.getCodPostagem());
			
			postagem.setEvento(evento);
		}
		else {
			if (entity.getTipoPostagem() == 2) {
				Noticia noticia = new Noticia();
				noticia.setCodNoticia(postagem.getCodPostagem());
				
				postagem.setNoticia(noticia);
			}
		}
		
		postagem = postagemRepository.saveAndFlush(postagem);
		
		return PostagemConverter.toPostagemResponse(postagem);
	}

	@Override
	public void deleteById(Long id) {
		postagemRepository.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public PostagemResponse findById(Long id) {
		var postagem = postagemRepository.findById(id).orElseThrow(()-> new EntityNotFoundException(
				String.format("Postagem não localizada %s", String.valueOf(id))));
		
		var postagemResponse = PostagemConverter.toPostagemResponse(postagem);
		
		return postagemResponse;
	}
}
