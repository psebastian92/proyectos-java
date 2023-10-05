package ej61;

import java.util.Scanner;

public class ej61 {
	
	static int cantNotas;
	static int notas[];
	static String apellidos[];
	
	public static int[] cargaNotas(int n) {
		Scanner entrada = new Scanner (System.in);
		notas = new int[n];
		
		for (int i = 0; i<cantNotas; i++) {
			System.out.println("Carga la nota numero "+ (i+1) +" : ");
			notas[i] = entrada.nextInt();
			while (notas[i]>10 || notas[i]<0) {
				System.out.println("Nota incorrecta. Agrega un valor correcto");
				notas[i] = entrada.nextInt();
			}
		}
		
		return notas;
	}

	public static String[] cargaApellidos(int n) {
		Scanner entrada = new Scanner (System.in);
		apellidos = new String[n];
		
		for (int i = 0; i<cantNotas; i++) {
			System.out.println("Carga el apellido numero "+ (i+1) +" : ");
			apellidos[i] = entrada.next();
			
		}
				
		return apellidos;
	}
	
	public static void cantidad() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Cuantas notas cargaras?");
		cantNotas = entrada.nextInt(); 
	}
	
	
	public static void main(String[] args) {
		
		cantidad();
		
		String[] arrayApellidos = cargaApellidos(cantNotas);
		int[] arrayNotas = cargaNotas(cantNotas);
		
		for (int i = 0; i < cantNotas; i++) {
			System.out.println("Apellido: "+arrayApellidos[i]+"\nCalificacion: "
			+arrayNotas[i]);
			System.out.println("");
		}
		

	}

}
