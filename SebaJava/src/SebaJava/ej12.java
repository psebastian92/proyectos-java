package SebaJava;
import java.util.Scanner;
    public class ej12 {
	public static void main (String args []) {
	Scanner datos= new Scanner (System.in);


	int[] num = new int[3];

	for (int i=0 ; i<2; i++){

	System.out.println("Inserte un numero");
	 num[i] = datos.nextInt();

	}
	num[2]=num[0]+num[1];
	System.out.println("el resultado es: " + num[2]);
	   


	}
	
    }

