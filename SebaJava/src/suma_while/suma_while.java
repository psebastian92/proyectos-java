package suma_while;

import java.util.Scanner;

public class suma_while {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int a, b, suma, salir;
		
		do {
			System.out.println("Ingresa un numero: ");
		a = entrada.nextInt();
		
		System.out.println("Ingresa otro numero: ");
		b = entrada.nextInt();
		
		suma = a + b;
		
		System.out.println("Resultado de la suma: "+suma);
		System.out.println("Toca el cero para salir. De lo contrario, ingresá otro numero: ");
		salir = entrada.nextInt();
		}while (salir !=0);
				
		System.out.println("Programa finalizado. ");
	}

}
