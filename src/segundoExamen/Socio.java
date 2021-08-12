package segundoExamen;

import java.util.ArrayList;

public class Socio {
	private String nombre;
	private int edad;
	private ArrayList<Socio> amigos;

	public Socio(String nombre, int edad) {
		setNombre(nombre);
		setEdad(edad);
		this.amigos = new ArrayList<Socio>();
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private int getEdad() {
		return edad;
	}

	private void setEdad(int edad) {
		if (edad > 0 && edad < 99) {
			this.edad = edad;
		}
	}

	public String dameNombre() {
		return this.getNombre();
	}

	/*
	 * public Resultado agregarAmigo(String nombre, String nombreAmigo) { Resultado
	 * resultado = null;
	 * 
	 * for (Socio socioActual : this.amigos) { if
	 * (socioActual.dameNombre().equals(nombreAmigo)) { resultado =
	 * Resultado.YA_SON_AMIGOS; } else if (socioActual.dameNombre().equals(nombre))
	 * { resultado = Resultado.MISMA_PERSONA; } else if
	 * (!socioActual.dameNombre().equals(nombreAmigo)) { resultado = Resultado.OK;
	 * this.amigos.add(socioActual); } } return resultado; }
	 */

	public void agregarAmigo(Socio socio) {
		this.amigos.add(socio);
	}

	public boolean sonAmigos(Socio socio) {
		boolean resultado = false;
		socio = buscarSocio(socio);

		if (socio != null) {
			resultado = true;
		}
		return resultado;
	}

	private Socio buscarSocio(Socio socio) {
		Socio elementoDevolver = null;
		Socio elementoActual;
		int pos = 0;
		int cantElementos = this.amigos.size();

		while (pos < cantElementos && elementoDevolver == null) {
			elementoActual = this.amigos.get(pos);
			if (elementoActual == socio) {
				elementoDevolver = elementoActual;
			} else {
				pos++;
			}
		}
		return elementoDevolver;
	}

	public void removerAmigo(Socio socio2) {
		this.amigos.remove(socio2);

	}

	public String amigoMasJoven() {
		int edadMax = 100;
		Socio amigoJoven;
		String nombreAmigoJoven = "";

		for (Socio amigoActual : amigos) {
			if (amigoActual.getEdad() < edadMax) {
				edadMax = amigoActual.getEdad();
				amigoJoven = amigoActual;
				nombreAmigoJoven = amigoJoven.dameNombre();
			}
		}
		return nombreAmigoJoven;
	}

	public boolean tieneAmigos() {
		boolean resultado = false;
		if (this.amigos.size() > 0) {
			resultado = true;
		}
		return resultado;
	}

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	public void recorrerAmigos() {
		for (Socio socio : amigos) {
			System.out.println(socio);
		}

	}

}
