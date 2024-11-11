package com.academico.models.service.dto.Converter;

import com.academico.models.model.Usuario;
import com.academico.models.service.dto.request.UsuarioRequest;
import com.academico.models.service.dto.response.UsuarioResponse;

public class UsuarioConverter {
	
	public static Usuario toUsuario(UsuarioRequest usuarioRequest) {
		return new Usuario(
					usuarioRequest.getIdUsuario(),
					usuarioRequest.getCodUsuario(),
					usuarioRequest.getNomeUsuario(),
					usuarioRequest.getEmail(),
					usuarioRequest.getSenha(),
					usuarioRequest.getFoto(),
					usuarioRequest.getTipo()
				);
	}
	
	public static UsuarioResponse toUsuarioResponse(Usuario usuario) {
		return new UsuarioResponse(
					usuario.getIdUsuario(),
					usuario.getCodUsuario(),
					usuario.getNomeUsuario(),
					usuario.getEmail()
				);
	}
}
