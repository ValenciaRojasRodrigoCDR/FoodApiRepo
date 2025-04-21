package com.api.fooddevrepo;


public class Repartidor {
	String nombre;
	int aniosEmpresa;
	float salario;
	public Repartidor(String nombre, int aniosEmpresa, float salario) {
		this.nombre = nombre;
		this.aniosEmpresa = aniosEmpresa;
		this.salario = salario;
	}
	public String getNombre() {
		return nombre;
	}
	
}
