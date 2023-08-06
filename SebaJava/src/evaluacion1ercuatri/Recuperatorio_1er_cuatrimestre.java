package evaluacion1ercuatri;

import java.util.Scanner;

public class Recuperatorio_1er_cuatrimestre {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int sueldo_maximo;
		int sueldo_minimo;

		int[] empleados = new int[4];

		for (int i = 0; i < 4; i++) {
			System.out.println("Ingrese los datos de los empleados:" + (i + 1));
			empleados[i] = entrada.nextInt();

		}

		for (int i = 0; i < empleados.length; i++) {
			if (empleados[i] > 99999 && empleados[i] < 10000) {
				int resta = i - 1;
				continue;

			}
		}
		for (int i = 0; i < empleados.length - 1; i++) {
			for (int j = 0; j < empleados.length - i - 1; j++) {
				if (empleados[j] > empleados[j + 1]) {
					int intercambio = empleados[j];
					empleados[j] = empleados[j + 1];
					empleados[j + 1] = intercambio;

				}
			}
		}

		System.out.println("Ordenamiento ordenado de forma anscendente los legajos:");
		for (int i = 0; i < empleados.length; i++) {
			System.out.println(empleados[i]);

		}
		String[] apellidos = new String[4];

		for (int i = 0; i < 4; i++) {
			System.out.println("Ingrese los apellidos");
			apellidos[i] = entrada.next();
		}
		int[] sueldo = new int[4];

		for (int i = 0; i < sueldo.length; i++) {
			System.out.println("ingrese el sueldo:");
			sueldo[i] = entrada.nextInt();

		}

		sueldo_maximo = sueldo[0];
		for (int i = 0; i < 4; i++) {
			if (sueldo[i] > sueldo_maximo) {
				sueldo_maximo = sueldo[i];
			}
		}
		sueldo_minimo = sueldo[0];
		for (int i = 0; i < 4; i++) {
			if (sueldo[i] < sueldo_minimo) {
				sueldo_minimo = sueldo[i];
			}
		}

		for (int i = 0; i < empleados.length; i++) {
			System.out.println("El apellido es: " + apellidos[i] + " El numero de legajo N� " + (i + 1) + " es: "
					+ empleados[i] + " Y sueldo es:" + sueldo[i]);

		}

		System.out.println("El Sueldo maximo es: " + sueldo_maximo);
		System.out.println("El Sueldo minimo es: " + sueldo_minimo);

	}

}
