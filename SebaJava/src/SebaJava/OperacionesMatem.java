package SebaJava;

import java.util.Scanner;

public class OperacionesMatem {
	public static void main (String args []) {
		Scanner entrada = new Scanner (System.in);
		float num1, num2, suma, resta, multip, div, resto;
		
		System.out.println("\tOperaciones matematicas");
		System.out.println("Escribí un número: ");
		num1 = entrada.nextFloat();
		System.out.println("Escribí otro número: ");
		num2 = entrada.nextFloat();
		
		System.out.println("Los resultados, son: ");
		
		suma = num1+ num2; // la variable "suma" toma el valor de num1+num2
		resta = num1-num2; // la variable "resta" toma el valor de num1-num2
		multip = num1*num2; // la variable "multip" toma el valor de num1*num2
		div = num1/num2; // la variable "div" toma el valor de num1/num2
		resto = num1%num2; // la variable "resto" toma el valor del resto de la division entre num1 y num2
		
		System.out.println("Resultado de la suma:"+suma);
		System.out.println("Resultado de la resta:"+resta);
		System.out.println("Resultado de la multiplicacion:"+multip);
		System.out.println("Resultado de la division:"+div);
		System.out.println("El resto de la division es: "+resto);
		
	}
}
