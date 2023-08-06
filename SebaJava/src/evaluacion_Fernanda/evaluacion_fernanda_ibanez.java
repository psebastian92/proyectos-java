package evaluacion_Fernanda;

import java.util.Scanner;

public class evaluacion_fernanda_ibanez {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String[] empleados = new String[4];
		int[] legajo = new int[4];
		int[] sueldo = new int[4];
		int legajo_max = 0, legajo_min = 1111111, sueldo_min = 10000, sueldo_max = 0;

		for (int i = 0; i < legajo.length; i++) {
			System.out.println("Ingrese el n�mero de legajo");
			legajo[i] = entrada.nextInt();
			if (legajo[i] < 9999 || legajo[i] < 10000) {

			}

		}
		for (int i = 0; i < legajo.length; i++) {

			for (int b = 0; b < legajo.length; b++) {
				for (int j = 0; j < legajo.length - b - 1; j++) {
					if (legajo[j] > legajo[j + 1]) {
						int orden = legajo[j];
						legajo[j] = legajo[j + 1];
						legajo[j + 1] = orden;
					}
				}
			}

		}
		System.out.println("\nlegajo ordenado");
		for (int orden : legajo) {
			System.out.println(+orden);

		}

		for (int a = 0; a < empleados.length; a++) {
			System.out.println("\nIngrese el apellido del empleados");
			empleados[a] = entrada.next();

		}
		for (int f = 0; f > sueldo.length; f++) {
			System.out.println("\nIngrese el sueldo del empleado");
			sueldo[f] = entrada.nextInt();

			if (sueldo[f] > sueldo_max) {

				sueldo[f] = sueldo_max;
			}
			if (sueldo[f] < sueldo_min) {

				sueldo[f] = sueldo_min;
			}

			System.out.println("\nEl numero de legajo del empleado " + empleados[i] + " es " + legajo
					+ "y su sueldo es de: " + sueldo[f]);
		}
		System.out.println("\nEl sueldo m�s alto es de : " + sueldo_max);
		System.out.println("El sueldo m�s bajo es de : " + sueldo_min);
	}

}
