package com.api.fooddevrepo;


public class Producto {
	int stock;
	float precio;
	String nombre;
	public Producto(int stock, float precio, String nombre) {
		this.stock = stock;
		this.precio = precio;
		this.nombre = nombre;
	}
	public int getStock() {
		return stock;
	}
	public float getPrecio() {
		return precio;
	}
	public String getNombre() {
		return nombre;
	}
	

}
