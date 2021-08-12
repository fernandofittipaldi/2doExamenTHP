package segundoExamen;

public class Test {

	public static void main(String[] args) {
		Club club = new Club("ClubAmigos");

		agregarSocio("Juan", 23, club);
		agregarSocio("Laura", 18, club);
		agregarSocio("Maria", 26, club);
		agregarSocio("Joaquin", 20, club);
		agregarSocio("Belen", 20, club);
		agregarSocio("Daniel", 21, club);
		agregarSocio("Valeria", 20, club);
		agregarSocio("Ana", 19, club);
		agregarSocio("Javier", 22, club);
		agregarSocio("Javier", 22, club);

		System.out.println();

		establecerAmistad("Juan", "Ana", club);
		establecerAmistad("Laura", "Ana", club);
		establecerAmistad("Laura", "Juan", club);
		establecerAmistad("Maria", "Ana", club);
		establecerAmistad("Belen", "Joaquin", club);
		establecerAmistad("Belen", "Daniel", club);
		establecerAmistad("Valeria", "Ana", club);
		establecerAmistad("Ana", "Daniel", club);
		establecerAmistad("Javier", "Juan", club);
		establecerAmistad("Javier", "Ana", club);
		establecerAmistad("Ana", "Javier", club);
		establecerAmistad("Ana", "Ana", club);
		establecerAmistad("Laura", "Marcelo", club);
		establecerAmistad("Toribio", "Ana", club);

		System.out.println();

		deshacerAmistad("Ana", "Javier", club);
		deshacerAmistad("Ana", "Valeria", club);
		deshacerAmistad("Josefina", "Josefina", club);
		deshacerAmistad("Laura", "Marcelo", club);
		deshacerAmistad("afsffs", "Javier", club);

		System.out.println();

		club.amigosMasJoven();

		System.out.println();

		club.listarAmigos("Ana");
		club.listarAmigos("Walter");
	}

	public static void agregarSocio(String nombre, int edad, Club c) {
		Resultado r = c.agregarSocio(nombre, edad);
		if (r == Resultado.OK) {
			System.out.println("agregarSocio (" + nombre + "," + edad + "): OK");
		} else {
			System.out.println("agregarSocio (" + nombre + "," + edad + "): YA_EXISTE");
		}
	}

	public static void establecerAmistad(String nombre1, String nombre2, Club c) {
		Resultado r = c.establecerAmistad(nombre1, nombre2);
		if (r == Resultado.OK) {
			System.out.println("establecerAmistad (" + nombre1 + "/" + nombre2 + "): OK");
		}
		if (r == Resultado.YA_SON_AMIGOS) {
			System.out.println("establecerAmistad (" + nombre1 + "/" + nombre2 + "): YA_SON_AMIGOS");
		}
		if (r == Resultado.MISMA_PERSONA) {
			System.out.println("establecerAmistad (" + nombre1 + "/" + nombre2 + "): MISMA_PERSONA");
		}
		if (r == Resultado.NO_EXISTE) {
			System.out.println("establecerAmistad (" + nombre1 + "/" + nombre2 + "): NO_EXISTE");
		}
	}

	public static void deshacerAmistad(String nombre1, String nombre2, Club c) {
		Resultado r = c.deshacerAmistad(nombre1, nombre2);
		if (r == Resultado.OK) {
			System.out.println("deshacerAmistad (" + nombre1 + "/" + nombre2 + "): OK");
		}
		if (r == Resultado.MISMA_PERSONA) {
			System.out.println("deshacerAmistad (" + nombre1 + "/" + nombre2 + "): MISMA_PERSONA");
		}
		if (r == Resultado.NO_EXISTE) {
			System.out.println("deshacerAmistad (" + nombre1 + "/" + nombre2 + "): NO_EXISTE");
		}

	}
}
