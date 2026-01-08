package proyecto;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		do {
			System.out.println("1. Mostrar saludo");
			System.out.println("2. Mostrar informacion del grupo");
			System.out.println("3. Mostrar despedida");
			System.out.println("0. Salir");
			opcion=Leer.datoInt();
			
		switch(opcion) {
		case 0:
			System.out.println("Saliendo...");
			break;
		case 1:
			System.out.println("Buenas tardes caballero");
			break;
		case 2:
			break;
		case 3:
			System.out.println("Que tenga usted un buen dia");
			break;
			
			default:
				System.out.println("Algo esta mal");
				break;
		}
			
		}while(opcion!=0);
		
	}

}
