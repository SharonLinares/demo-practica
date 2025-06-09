package com.example.demo.dto;

import java.util.List;

public class FacturaDto {

	private UsuarioDto usuario;
	private List<ProductoDto> productos;

	public UsuarioDto getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDto usuario) {
		this.usuario = usuario;
	}

	public List<ProductoDto> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoDto> productos) {
		this.productos = productos;
	}

}
