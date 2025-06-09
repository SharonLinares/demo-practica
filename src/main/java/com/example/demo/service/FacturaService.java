package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.FacturaDto;
import com.example.demo.dto.ProductoDto;
import com.example.demo.dto.UsuarioDto;

public class FacturaService {

	private List<FacturaDto> facturas = new ArrayList<>();

	public void agregarFactura(UsuarioDto usuariodto, List<ProductoDto> productos) {
		FacturaDto facturadto = new FacturaDto();
		facturadto.setProductos(productos);
		facturadto.setUsuario(usuariodto);

		this.facturas.add(facturadto);

	}

	public List<FacturaDto> consultarFacturas() {
		return facturas;
	}

	public FacturaDto consultarFacturaPorUsuario(UsuarioDto usuariodto) {
		for (FacturaDto facturaDto : facturas) {
			UsuarioDto usuario = facturaDto.getUsuario();
			if (usuario.getId().equals(usuariodto.getId())) {
				return facturaDto;
			}
		}

		return null;

	}

}
