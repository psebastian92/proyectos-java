package SebaJava;

import java.util.Scanner;

public class pruebaif {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int dato;
		int num1 = 10;
		int num2 = 20;
		
		dato = entrada.nextInt();
		
		if (dato <40 && dato>30) {
			System.out.println("Esta en rango");
		}
		else {
			System.out.println("Esta fuera de rango");
		}
		
	}

}
