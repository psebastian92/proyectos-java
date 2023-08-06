package recuperatorio_primercuatrimestre;

import java.util.Scanner;

public class recuperatorio_primercuatrimestre {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] numero_legajo = new int[3];
		String[] Apellidos = new String[3];
		int[] Sueldo = new int[3];
		int sueldo_max = -30000, sueldo_min = 150000;
		int i;

		for (i = 0; i < (numero_legajo.length); i++) {
			System.out.println("Ingresar numeros de legajo : ");
			numero_legajo[i] = entrada.nextInt();

			if (numero_legajo[i] > 99999 && numero_legajo[i] < 10000) {

				int resta = i - 1;
				continue;
			}

		}
		for (i = 0; i < (numero_legajo.length); i++) {

			for (int j = 0; j < (numero_legajo.length - i - 1); j++) {

				if (numero_legajo[j] > numero_legajo[j + 1]) {

					int temporal = numero_legajo[j];

					numero_legajo[j] = numero_legajo[j + 1];

					numero_legajo[j + 1] = temporal;

				}
			}
			System.out.println("\nArreglo ordenado:");
			for (int num : numero_legajo) {
				System.out.print(num + " ");
			}

			for (i = 0; i < 3; i++) {
				System.out.println("Ingrese una cantidad del sueldo: ");
				Sueldo[i] = entrada.nextInt();

				if (Sueldo[i] > sueldo_max) {
					sueldo_max = Sueldo[i];
				}
				if (Sueldo[i] < sueldo_min) {
					sueldo_min = Sueldo[i];

				}

				System.out.println("Ingrese un apellido: ");
				Apellidos[i] = entrada.next();
			}

		}

		System.out.println("El sueldo minimo es " + sueldo_min);

		System.out.println("El sueldo maximo es " + sueldo_max);

		System.out.println("El apellido del empleado es" + Apellidos[0] + " y el numero de legajo es "
				+ numero_legajo[0] + " y sueldo es de: " + Sueldo[0]);

		System.out.println("El apellido del empleado es" + Apellidos[1] + " y el numero de legajo es "
				+ numero_legajo[1] + " y sueldo es de: " + Sueldo[1]);
		System.out.println("El apellido del empleado es" + Apellidos[2] + " y el numero de legajo es "
				+ numero_legajo[2] + " y sueldo es de: " + Sueldo[2]);
		System.out.println("El apellido del empleado es" + Apellidos[3] + " y el numero de legajo es "
				+ numero_legajo[3] + " y sueldo es de: " + Sueldo[3]);
	}
}