package com.example.demo.controller;

import java.util.List;

import com.example.demo.dto.FacturaDto;
import com.example.demo.dto.ProductoDto;
import com.example.demo.dto.UsuarioDto;
import com.example.demo.service.FacturaService;

public class FacturaController {

	private FacturaService facturaservice = new FacturaService();

	public void crearFactura(UsuarioDto usuariodto, List<ProductoDto> productos) {
		facturaservice.agregarFactura(usuariodto, productos);
	}

	public void imprimirFactura() {
		List<FacturaDto> facturas = facturaservice.consultarFacturas();
		for (FacturaDto facturaDto : facturas) {
			System.out.println(facturaDto.getUsuario().getNombre());
			System.out.println(facturaDto.getUsuario().getPrimerApellido());
			System.out.println(facturaDto.getUsuario().getSegundoApellido());
		}
	}
}
