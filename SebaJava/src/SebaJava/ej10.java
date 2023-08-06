package SebaJava;

import java.util.Scanner;

public class ej10 {
	
	
	public static void main (String args[]) {
		
		Scanner lectura = new Scanner (System.in);
		
		float temp, tempmax = -300, tempmin= 300;
	
			 for (int hora = 0; hora <=24 ; hora+=4 ) {
			 
				 System.out.println("Ingrese la temperatura a las "+hora+"hs: ");
				 temp = lectura.nextFloat();
			
				 if ( temp> tempmax  ) {
					 tempmax = temp;

					 
				 }
			 if (temp< tempmin) {
				 tempmin = temp;
			 }
			 
		 }
		 
			 System.out.println("El numero maximo es:"+tempmax);
			 
			 System.out.println("El numero minimo es:"+tempmin);
			 
			 
}}