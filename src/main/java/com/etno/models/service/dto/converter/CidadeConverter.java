package com.etno.models.service.dto.converter;

import com.etno.models.model.Cidade;
import com.etno.models.service.dto.request.CidadeRequest;
import com.etno.models.service.dto.response.CidadeResponse;

public class CidadeConverter {
	public static Cidade toCidade(CidadeRequest cidadeRequest) {
		return new Cidade(
					cidadeRequest.getIdCidade(),
					cidadeRequest.getCodCidade(),
					cidadeRequest.getNomeCidade()
				);
	}
	
	public static CidadeResponse toCidadeResponse(Cidade cidade) {
		return new CidadeResponse(
					cidade.getIdCidade(),
					cidade.getCodCidade(),
					cidade.getNomeCidade()
				);
	}
}
