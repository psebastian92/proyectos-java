package tp_1er_bim;

import java.util.Scanner;

public class tp_1er_bim_corregido {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		int opc;

		System.out.println("\tEste programa te permite resolver algunos problemas");
		System.out.println("\tElegí una opción: ");
		System.out.println("1. Calcular raiz cuadrada.");
		System.out.println("2. Analizar si un numero es positivo, negativo o cero.");
		System.out.println("3. Jugar al bingo."+"\n");

		opc = datos.nextInt();

		switch (opc) {

		case 1:
			System.out.println("Ingresa un número para calcular su raiz cuadrada: ");

			int num_raiz;
			num_raiz = datos.nextInt();
			
			if (num_raiz >= 0) {
			int raiz_cuadrada = (int) Math.sqrt(num_raiz);
			System.out.println("El resultado es: " + raiz_cuadrada);
			}
			else {
				System.out.println("No se puede calcular la raiz de un negativo.");
			}
			
			
			break;

		case 2:
			System.out.println("Ingresa un numero: ");

			int num_signo;
			num_signo = datos.nextInt();

			if (num_signo == 0) {
				System.out.println("El numero es cero");
			} else if (num_signo > 0) {
				System.out.println("El numero es positivo");
			} else {
				System.out.println("El numero es negativo");
			}
			
			break;

		case 3:
			System.out.println("Ingresa un numero entre 0 y 9");

			int num_bingo;
			num_bingo = datos.nextInt();

			double num_ganador_double = Math.random()*9;
			int num_ganador = (int) num_ganador_double;

			if (num_bingo == num_ganador) {
				System.out.println("Ganaste!");
			} else {
				System.out.println("Perdiste :(");
				System.out.println("El numero ganador es: "+num_ganador);
			}
			
			break;
			
		default: System.out.println("Opcion incorrecta.");
		break;

		}
	}
}
