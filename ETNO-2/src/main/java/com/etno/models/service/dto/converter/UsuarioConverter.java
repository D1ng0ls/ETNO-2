package com.etno.models.service.dto.converter;

import com.etno.models.model.Usuario;
import com.etno.models.service.dto.request.UsuarioRequest;
import com.etno.models.service.dto.response.UsuarioResponse;

public class UsuarioConverter {
	public static Usuario toUsuario(UsuarioRequest usuarioRequest) {
		return new Usuario(
					usuarioRequest.getIdUsuario(),
					usuarioRequest.getCodUsuario(),
					usuarioRequest.getNomeUsuario(),
					usuarioRequest.getEmailUsuario(),
					usuarioRequest.getSenhaUsuario(),
					usuarioRequest.getFotoUsuario()
				);
	}
	
	public static UsuarioResponse toUsuarioResponse(Usuario usuario) {
		return new UsuarioResponse(
					usuario.getIdUsuario(),
					usuario.getCodUsuario(),
					usuario.getNomeUsuario(),
					usuario.getEmailUsuario()
				);
	}
}