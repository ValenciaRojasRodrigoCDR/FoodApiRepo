package service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.api.fooddevrepo.Producto;
import com.api.fooddevrepo.Repartidor;
import com.api.fooddevrepo.Tienda;
import com.api.fooddevrepo.Usuario;

public class TiendaService {
	static Set<Producto> listaP = new HashSet<>();

	static Repartidor Sergio = new Repartidor("Sergio", 1, 16000.2f);
	static Repartidor Carlos = new Repartidor("Carlos", 2, 18000f);
	static Repartidor Manuel = new Repartidor("Manuel", 5, 22000f);
	static Producto macarrones = new Producto(10, 1, "macarrones");
	static Producto pan = new Producto(4, 0.5f, "pan");
	static Producto lechuga = new Producto(10, 1.5f, "Lechuga");

	static List<Usuario> lista = new ArrayList<>();
	static Scanner teclado = new Scanner(System.in);

	public static void inicio() {
		String nombre;
		String contrasenia;
		if (lista.size() == 0) {
			System.out.println("no hay ningun usuario creado debe crear un usuario ");
			aniadir();
		} else {
			System.out.println("Nombre");
			nombre = teclado.next();
			System.out.println("contrasenia");
			contrasenia = teclado.next();
			for (Usuario usuario : lista) {
				if (nombre.equalsIgnoreCase(usuario.getNombre()) && contrasenia.equals(usuario.getContrasenia())) {
					System.out.println("Bienvenido " + usuario.getNombre() + " " + usuario.getApellido());
					menuTienda();

				} else {
					System.out.println("este usuario no exsite ");
				}
			}
		}

	}

	public static void aniadir() {
		String nombre = "";
		String apellido = "";
		String contasenia = "";

		// lista.stream().anyMatch(k->k.getNombre().contains('a'));
		System.out.println("dime el nombre");
		nombre = teclado.next();
		System.out.println("dime el  apellido");
		apellido = teclado.next();
		System.out.println("dime la contasenia");
		contasenia = teclado.next();
		Usuario nuevo = new Usuario(nombre, apellido, contasenia);
		lista.add(nuevo);
		System.out.println("Usuario creado");

	}

	public static void menuTienda() {
		listaP.add(macarrones);
		listaP.add(pan);
		listaP.add(lechuga);
		Tienda mercadona = new Tienda("mercadona", listaP, Sergio);
		Tienda lidl = new Tienda("lidl", listaP, Manuel);
		Tienda ahorramas = new Tienda("ahorramas", listaP, Carlos);
		int eleccion = -1;
		while (eleccion != 0) {
			System.out.println(
					"Bienvenido a nuestro portal pulse 1 acceder a mercadona sesion pulsa 2 para acceder a lidl pulsa 3 ahorramas 0 sañir");
			eleccion = teclado.nextInt();
			switch (eleccion) {
			case 1: {
				System.out.println("has entrado en mercadona estos son nuestros productos");
				for (Producto p : mercadona.Producto) {
					System.out.println(p.getNombre());
				}
				break;
			}
			case 2: {
				System.out.println("has entrado en lidl estos son nuestros productos");
				for (Producto p : lidl.Producto) {
					System.out.println(p.getNombre());
				}
				break;
			}
			case 3: {
				System.out.println("has entrado en ahorramas estos son nuestros productos");
				for (Producto p : ahorramas.Producto) {
					System.out.println(p.getNombre());
				}
				break;
			}
			case 0: {
				System.out.println("Adios");
				break;
			}
			default:
				System.out.println("eleccion incorrecta");
			}

		}

	}

	public static void menu() {
		int eleccion = -1;
		while (eleccion != 0) {

			System.out.println(
					"Bienvenido a nuestro portal pulse 1 para iniciar sesion pulsa 2 para crear una cuenta 0 salir");
			eleccion = teclado.nextInt();
			switch (eleccion) {
			case 1: {
				inicio();

				break;

			}
			case 2: {
				aniadir();
				break;

			}
			case 0: {
				System.out.println("adios");
				break;
			}
			default:
				System.out.println("eleccion incorrecta");

			}

		}
	}



}
