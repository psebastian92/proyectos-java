package integrador3erBim;

import java.util.Scanner;

public class etapa1 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Declaro arrays para filas con sus letras, y dentro de cada array coloco el
		// numero de asiento
		int[] filaA = { 1, 2, 3, 4 };
		int[] filaB = { 1, 2, 3, 4 };
		int[] filaC = { 1, 2, 3, 4 };

		// Declaro arrays booleanos para analizar la ocupacion de cada asiento
		// Comienzan en "false", ya que los asientos inicialmente NO estan ocupados.
		boolean[] ocupadoA = { false, false, false, false };
		boolean[] ocupadoB = { false, false, false, false };
		boolean[] ocupadoC = { false, false, false, false };
	

		// Declaro la variable que buscara el numero de asiento
		int numeroAsiento;
		System.out.println("Que fila desea? ");
		// declaro la variable tipo "String" llamada "fila". Esta variable es para
		// elegir opciones de fila.
		// Uso "String" y no "char", porque voy a usar el metodo toLowerCase() que
		// funciona con "String".
		String fila = entrada.next();

		// Convierto fila a minusculas con "toLowerCase()" por si el usuario ingreso
		// mayusculas.
		switch (fila.toLowerCase()) {

		case "a":
			System.out.println("Que numero de asiento desea?");
			numeroAsiento = entrada.nextInt();

			
			while (ocupadoA[numeroAsiento-1]) {
				System.out.println("Asiento ocupado. Volve a ingresar un numero de asiento");
				numeroAsiento = entrada.nextInt();
			}
			if(ocupadoA[numeroAsiento-1] == false ) {
				System.out.println("Asiento numero " + filaA[numeroAsiento-1]+" en la fila A fue ocupado.");
				ocupadoA[numeroAsiento-1] = true;
			}
			break;

		case "b":
			System.out.println("Que numero de asiento desea?");
			numeroAsiento = entrada.nextInt();

			while (ocupadoB[numeroAsiento-1]) {
				System.out.println("Asiento ocupado. Volve a ingresar un numero de asiento");
				numeroAsiento = entrada.nextInt();
			}
			if(ocupadoB[numeroAsiento-1] == false ) {
				System.out.println("Asiento numero " + filaB[numeroAsiento-1]+" en la fila B fue ocupado.");
				ocupadoB[numeroAsiento-1] = true;
			}
			
			break;
			

		case "c":
			System.out.println("Que numero de asiento desea?");
			numeroAsiento = entrada.nextInt();

		
				
				while (ocupadoC[numeroAsiento-1]) {
					System.out.println("Asiento ocupado. Volve a ingresar un numero de asiento");
					numeroAsiento = entrada.nextInt();
				}
				if(ocupadoC[numeroAsiento-1] == false ) {
					System.out.println("Asiento numero " + filaC[numeroAsiento-1]+" en la fila C fue ocupado.");
					ocupadoC[numeroAsiento-1] = true;
				}
			
			
			break;

		default: System.out.println("Opcion incorrecta. Volve a comenzar el programa.");
		
		

		}

	}
}
