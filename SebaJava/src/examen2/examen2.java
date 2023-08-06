package examen2;

import java.util.Arrays;
import java.util.Scanner;

public class examen2 {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		int[] legajos = new int[5];

		String[] apellidos = new String[5];

		int[] notas = new int[5];
		
		String apellidoMax = "";

		String apellidoMin = "";
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Ingrese el numero de legajo del estudiante " + (i + 1));
			legajos[i] = datos.nextInt();

			System.out.println("Ingrese el apellido del estudiante " + (i + 1));
			apellidos[i] = datos.next();

			System.out.println("Ingrese la nota del estudiante " + (i + 1));
			notas[i] = datos.nextInt();

		}

		Arrays.sort(legajos);

		int notaMax = notas[0];
		int notaMin = notas[0];
		int sumaNotas = notas[0];

		for (int i = 0; i < 5; i++) {

			if (notas[i] > notaMax) {
				notaMax = notas[i];
				apellidoMax = apellidos[i];
			}

			if (notas[i] < notaMin) {
				notaMin = notas[i];
			    apellidoMin = apellidos[i];
			}

			sumaNotas += notas[i];

		}

		double promedio = (double) sumaNotas / 5;

		System.out.println("Datos de los estudiantes: ");

		for (int i = 0; i < 5; i++) {

			System.out.println("Estudiante: " + (i + 1) + "Apellidos: " + apellidos[i] + "Legajos: " + legajos[i]
					+ "Notas: " + notas[i]);
		}

		System.out.println("Nota Maxima: "+ notaMax);
		System.out.println("Pertenece a: " + apellidoMax + notaMax);
		
		System.out.println("Nota Minima: "+ notaMin);
		System.out.println("Pertenece a: " + apellidoMin + notaMin);
	
	System.out.println("Promedio de las notas: "+ promedio);
	}
}