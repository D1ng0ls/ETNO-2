package com.etno.models.service.dto.converter;

import com.etno.models.model.Postagem;
import com.etno.models.service.dto.request.PostagemRequest;
import com.etno.models.service.dto.response.PostagemResponse;

public class PostagemConverter {
	public static Postagem toPostagem(PostagemRequest postagemRequest) {
		return new Postagem(
					postagemRequest.getIdPostagem(),
					postagemRequest.getCodPostagem(),
					postagemRequest.getTituloPostagem(),
					postagemRequest.getDataPostagem(),
					postagemRequest.getImagemPostagem(),
					postagemRequest.getUrlPostagem(),
					postagemRequest.getTipoPostagem()
				);
	}
	
	public static PostagemResponse toPostagemResponse(Postagem postagem) {
		return new PostagemResponse(
					postagem.getIdPostagem(),
					postagem.getCodPostagem(),
					postagem.getTituloPostagem(),
					postagem.getDataPostagem(),
					postagem.getImagemPostagem(),
					postagem.getUrlPostagem(),
					postagem.getTipoPostagem()
				);
	}
}
