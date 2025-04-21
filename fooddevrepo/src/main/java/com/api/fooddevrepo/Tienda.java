package com.api.fooddevrepo;

import java.util.Set;

public class Tienda {
	public Set<Producto> Producto;
	float precio;
	Repartidor repartidor;
	String nombre;
	public Tienda( String nombre,Set<Producto> producto, Repartidor repartidor) {
		
		this.Producto = producto;
		this.repartidor = repartidor;
		this.nombre = nombre;
	}
	public Set<Producto> getProducto() {
		return Producto;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
