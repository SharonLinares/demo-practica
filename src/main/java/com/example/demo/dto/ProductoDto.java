package com.example.demo.dto;

public class ProductoDto {

	private String nombre;
	private int cantidad;
	private double valor;

	public ProductoDto(String nombre, int cantidad, double valor) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.valor = valor;
	}

	public ProductoDto() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
