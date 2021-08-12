package segundoExamen;

import java.util.ArrayList;

public class Club {
	private String nombre;
	private ArrayList<Socio> socios;

	public Club(String nombre) {
		setNombre(nombre);
		this.socios = new ArrayList<Socio>();
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Resultado agregarSocio(String nombre, int edad) {
		Socio socio;
		Resultado resultado;

		socio = buscarSocio(nombre);

		if (socio == null) {
			socio = new Socio(nombre, edad);
			this.socios.add(socio);
			resultado = Resultado.OK;
		} else {
			resultado = Resultado.YA_EXISTE;
		}
		return resultado;
	}

	private Socio buscarSocio(String nombre) {
		Socio elementoDevolver = null;
		Socio elementoActual;
		int pos = 0;
		int cantElementos = this.socios.size();

		while (pos < cantElementos && elementoDevolver == null) {
			elementoActual = this.socios.get(pos);
			if (elementoActual.dameNombre().equals(nombre)) {
				elementoDevolver = elementoActual;
			} else {
				pos++;
			}
		}
		return elementoDevolver;
	}

	public Resultado establecerAmistad(String nombre, String nombreAmigo) {
		Resultado resultado = null;
		Socio socio1;
		Socio socio2;

		socio1 = buscarSocio(nombre);
		socio2 = buscarSocio(nombreAmigo);

		if (socio1 != null && socio2 != null) {
			if (socio1.sonAmigos(socio2)) {
				resultado = Resultado.YA_SON_AMIGOS;
			} else {
				socio1.agregarAmigo(socio2);
				socio2.agregarAmigo(socio1);
				resultado = Resultado.OK;
			}
		}
		if (socio1 == null || socio2 == null) {
			resultado = Resultado.NO_EXISTE;
		}
		if (socio1 == socio2) {
			resultado = Resultado.MISMA_PERSONA;
		}

		return resultado;
	}

	public Resultado deshacerAmistad(String nombre, String nombreAmigo) {
		Resultado resultado = null;
		Socio socio1;
		Socio socio2;

		socio1 = buscarSocio(nombre);
		socio2 = buscarSocio(nombreAmigo);

		if (socio1 != null && socio2 != null) {
			if (socio1.sonAmigos(socio2)) {
				socio1.removerAmigo(socio2);
				socio2.removerAmigo(socio1);
				resultado = Resultado.OK;
			}
		}
		if (socio1 == null || socio2 == null) {
			resultado = Resultado.NO_EXISTE;
		}
		if (socio1 == socio2) {
			resultado = Resultado.MISMA_PERSONA;
		}

		return resultado;
	}

	public void amigosMasJoven() {
		System.out.println("Socios con su amigo más joven: ");
		for (Socio socio : socios) {
			if (socio.tieneAmigos()) {
				System.out.println(socio.dameNombre() + " - " + socio.amigoMasJoven());
			}
		}
	}

	public void listarAmigos(String nombre) {
		Socio socio;
		socio = buscarSocio(nombre);

		System.out.println("Amigos de " + nombre);
		if (socio != null) {
			socio.recorrerAmigos();
		} else {
			System.out.println("No se encuentra al socio " + nombre);
		}

	}

}
