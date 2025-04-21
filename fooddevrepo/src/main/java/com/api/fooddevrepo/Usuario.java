package com.api.fooddevrepo;

//lamda

// programacion funional
//mover todo a TiendaService

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Usuario {
	String Nombre;
	String Apellido;
	String Contrasenia;

	public Usuario(String Nombre, String Apellido, String Contrasenia) {
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.Contrasenia = Contrasenia;
	}

	public String getNombre() {
		return Nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public String getContrasenia() {
		return Contrasenia;
	}

	// si no especificas entre float y double elige double

	
}
