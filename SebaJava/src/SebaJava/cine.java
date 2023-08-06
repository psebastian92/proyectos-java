package SebaJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cine {
	

	public static void main (String args []) {
		Scanner datos= new Scanner (System.in);
		
		String nombre, apellido;
		int pos, cant_total=0;
		
		String[] butacaA = new String [4];
		String[] butacaB = new String [4];
		String[] butacaC = new String [4];
		
	
		
		while (cant_total <12) {
			
			System.out.println("Que posicion desea? ");
			System.out.println("Digite 1 para primera fila");
			System.out.println("Digite 2 para segunda fila");
			System.out.println("Digite 3 para tercera fila");
			System.out.println("Digite 4 para cuarta fila");
			System.out.println("\n");
			
			pos = datos.nextInt();
		
			switch(pos) { 
			
			case 1:
				if ( !(butacaA[0] == null || butacaB[0] == null || butacaC[0] == null ) ){
					System.out.println("Primera fila llena ");
				}
				
				else if (butacaA[0] == null) {
					butacaA[0] = ("Butaca A1. $500");
					System.out.println(butacaA[0]);
					cant_total ++;
				}
				
				else if (butacaB[0] == null) {
					butacaB[0]=("Butaca B1. $500");
					System.out.println(butacaB[0]);
					cant_total ++;
				}
				else if (butacaC[0] == null) {
					butacaC[0]=("Butaca C1. $500");
					System.out.println(butacaC[0]);
					cant_total ++;					
				}
				
								
				break;
				
								
			case 2:
				
				if ( !(butacaA[1] == null || butacaB[1] == null || butacaC[1] == null ) ){
					System.out.println("Segunda fila llena ");
				}
				
				else if (butacaA[1] == null) {
					butacaA[1] = ("Butaca A2. $300");
					System.out.println(butacaA[1]);
					cant_total ++;
				}
				
				else if (butacaB[1] == null) {
					butacaB[1]=("Butaca B2. $300");
					System.out.println(butacaB[1]);
					cant_total ++;
				}
				else if (butacaC[1] == null) {
					butacaC[1]=("Butaca C2. $300");
					System.out.println(butacaC[1]);
					cant_total ++;					
				}
				break;
					
				
				
			case 3:
				
				if ( !(butacaA[2] == null || butacaB[2] == null || butacaC[2] == null ) ){
					System.out.println("Tercera fila llena ");
				}
				
				else if (butacaA[2] == null) {
					butacaA[2] = ("Butaca A3. $300");
					System.out.println(butacaA[2]);
					cant_total ++;
				}
				
				else if (butacaB[2] == null) {
					butacaB[2]=("Butaca B3. $300");
					System.out.println(butacaB[2]);
					cant_total ++;
				}
				else if (butacaC[2] == null) {
					butacaC[2]=("Butaca C3. $300");
					System.out.println(butacaC[2]);
					cant_total ++;					
				}
				
				break;
				
			case 4:
				if ( !(butacaA[3] == null || butacaB[3] == null || butacaC[3] == null ) ){
					System.out.println("Cuarta fila llena ");
				}
				
				else if (butacaA[3] == null) {
					butacaA[3] = ("Butaca A4. $200");
					System.out.println(butacaA[3]);
					cant_total ++;
				}
				
				else if (butacaB[3] == null) {
					butacaB[3]=("Butaca B4. $200");
					System.out.println(butacaB[3]);
					cant_total ++;
				}
				else if (butacaC[3] == null) {
					butacaC[3]=("Butaca C4. $200");
					System.out.println(butacaC[3]);
					cant_total ++;									
				}
				break;
				
			default: 
				System.out.println("Posicion incorrecta ");
				break;
			}
			
			System.out.println("\n");
			
			
			
		}
		System.out.println("\n");
		System.out.println("Salon lleno ");
		
	}
}
