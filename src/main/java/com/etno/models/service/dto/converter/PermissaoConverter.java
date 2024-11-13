package com.etno.models.service.dto.converter;

import com.etno.models.model.Permissao;
import com.etno.models.service.dto.request.PermissaoRequest;
import com.etno.models.service.dto.response.PermissaoResponse;

public class PermissaoConverter {
	public static Permissao toPermissao(PermissaoRequest permissaoRequest) {
		return new Permissao(
					permissaoRequest.getIdPermissao(),
					permissaoRequest.getCodPermissao(),
					permissaoRequest.getNomePermissao()
				);
	}
	
	public static PermissaoResponse toPermissaoResponse(Permissao permissao) {
		return new PermissaoResponse(
					permissao.getIdPermissao(),
					permissao.getCodPermissao(),
					permissao.getNomePermissao()
				);
	}
}
