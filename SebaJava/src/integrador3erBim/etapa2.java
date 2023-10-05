package integrador3erBim;

import java.util.Scanner;

public class etapa2 {

	static int numeroAsiento;

	static int recaudacion = 0;

	static boolean salaLlena = false;

	static boolean seguirEligiendoFila = true;

	static boolean filaA_Llena = false;
	static boolean filaB_Llena = false;
	static boolean filaC_Llena = false;

	public static void venderEntradas() {
		Scanner entrada = new Scanner(System.in);
		int[] filaA = { 1, 2, 3, 4 };
		int[] filaB = { 1, 2, 3, 4 };
		int[] filaC = { 1, 2, 3, 4 };

		boolean[] ocupadoA = { false, false, false, false };
		boolean[] ocupadoB = { false, false, false, false };
		boolean[] ocupadoC = { false, false, false, false };

		while (salaLlena == false) {

			
			
			System.out.println("Que fila desea? ");
			seguirEligiendoFila = true;
			// declaro la variable tipo "String" llamada "fila". Esta variable es para
			// elegir opciones de fila.
			// Uso "String" y no "char", porque voy a usar el metodo toLowerCase() que
			// funciona con "String".

			String fila = entrada.next();

			switch (fila.toLowerCase()) {

			case "a":
				while (filaA_Llena == false) {
					System.out.println("Que numero de asiento desea?");
					numeroAsiento = entrada.nextInt();
					while (ocupadoA[numeroAsiento - 1]) {
						System.out.println("Asiento ocupado. Volve a ingresar un numero de asiento");
						numeroAsiento = entrada.nextInt();
					}
					if (ocupadoA[numeroAsiento - 1] == false) {
						System.out.println("Asiento numero " + filaA[numeroAsiento - 1] + " en la fila A fue ocupado.");
						ocupadoA[numeroAsiento - 1] = true;
						recaudacion += 500;
					}

					System.out.println("Ingresa otro asiento\n");

					if (ocupadoA[0] == true && ocupadoA[1] == true && ocupadoA[2] == true && ocupadoA[3] == true) {
						filaA_Llena = true;
						System.out.println("Se lleno la fila A \n");
					}	

				}
				break;

			case "b":

				while (filaB_Llena == false) {
					System.out.println("Que numero de asiento desea?");
					numeroAsiento = entrada.nextInt();
					while (ocupadoB[numeroAsiento - 1]) {
						System.out.println("Asiento ocupado. Volve a ingresar un numero de asiento");
						numeroAsiento = entrada.nextInt();
					}
					if (ocupadoB[numeroAsiento - 1] == false) {
						System.out.println("Asiento numero " + filaB[numeroAsiento - 1] + " en la fila B fue ocupado.");
						ocupadoB[numeroAsiento - 1] = true;
						recaudacion += 700;
					}

					System.out.println("Ingresa otro asiento\n");

					if (ocupadoB[0] == true && ocupadoB[1] == true && ocupadoB[2] == true && ocupadoB[3] == true) {
						filaB_Llena = true;
						System.out.println("Se lleno la fila B \n");
					}

				}

				break;

			case "c":

				while (filaC_Llena == false && seguirEligiendoFila == true) {

					System.out.println("Que numero de asiento desea?");
					numeroAsiento = entrada.nextInt();

					while (ocupadoC[numeroAsiento - 1]) {
						System.out.println("Asiento ocupado. Volve a ingresar un numero de asiento");
						numeroAsiento = entrada.nextInt();
					}

					if (ocupadoC[numeroAsiento - 1] == false) {
						System.out.println("Asiento numero " + filaC[numeroAsiento - 1] + " en la fila C fue ocupado.");
						ocupadoC[numeroAsiento - 1] = true;
						recaudacion += 1000;
					}

					System.out.println("Ingresa otro asiento\n");

					if (ocupadoC[0] == true && ocupadoC[1] == true && ocupadoC[2] == true && ocupadoC[3] == true) {
						filaC_Llena = true;
						System.out.println("Se lleno la fila C \n");
					}

					if (filaC_Llena == false) {
						System.out.println("Desea elegir otra fila? S/N");
						char eleccion = entrada.next().charAt(0);
						if (eleccion == 's' || eleccion == 'S') {
							seguirEligiendoFila = false;
						}
					}

				}

				break;

			default:
				System.out.println("Opcion incorrecta. Volve a comenzar el programa.");
			}

			cineLleno();
		}

	}

	public static void ingresosTotales() {
		System.out.println("La recaudacion total es: " + recaudacion);
	}

	public static void cineLleno() {
		if (filaA_Llena && filaB_Llena && filaC_Llena) {
			salaLlena = true;
			System.out.println("Se lleno la sala");
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		venderEntradas();
		ingresosTotales();

	}

}
