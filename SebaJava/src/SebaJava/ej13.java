package SebaJava;
import java.util.Scanner;
public class ej13 {
	public static void main (String args []) {
	Scanner datos= new Scanner (System.in);
	
	String nombre;
	int Promedio;
	
	System.out.println("El nombre es: ");
	 nombre = datos.next();

	int[] notas = new int[3];

	for (int i=0 ; i<3; i++){

	System.out.println("La nota es: ");
	 notas [i] = datos.nextInt();

	}
	Promedio=(notas[0]+notas[1]+notas[2])/3;
	System.out.println("La nota final es:  " + Promedio);
	
	
	}}
