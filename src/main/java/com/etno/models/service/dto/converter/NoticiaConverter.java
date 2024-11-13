package com.etno.models.service.dto.converter;

import com.etno.models.model.Noticia;
import com.etno.models.service.dto.request.NoticiaRequest;
import com.etno.models.service.dto.response.NoticiaResponse;

public class NoticiaConverter {
	public static Noticia toNoticia(NoticiaRequest noticiaRequest) {
		return new Noticia(
					noticiaRequest.getCodNoticia()
				);
	}
	
	public static NoticiaResponse toNoticiaResponse(Noticia noticia) {
		return new NoticiaResponse(
					noticia.getCodNoticia()
				);
	}
}
