package SebaJava;

import java.util.Iterator;

	public class butacas {
		
		public static void main (String [] args){
			
			boolean[] flags= new boolean [12];
			flags[0]=true;
			flags[1]=true;
			flags[2]=true;
			flags[3]=true;
			flags[4]=true;
			flags[5]=true;
			flags[6]=true;
			flags[7]=true;
			flags[8]=true;
			flags[9]=true;
			flags[10]=true;
			flags[11]=true;
			
			int []precios= new int [12];
			String[] nombres= new String[12];
			
			int ventas=0;
			
			
			nombres[0]= "butaca a1";
			nombres[1]= "butaca a2";
			nombres[2]= "butaca a3";
			nombres[3]= "butaca a4";
			nombres[4]= "butaca b1";
			nombres[5]= "butaca b2";
			nombres[6]= "butaca b3";
			nombres[7]= "butaca b4";
			nombres[8]= "butaca c1";
			nombres[9]= "butaca c2";
			nombres[10]= "butaca c3";
			nombres[11]= "butaca c4";
			
			
			
			precios[0]=500;
			precios[1]=300;
			precios[2]=300;
			precios[3]=200;
			precios[4]=500;
			precios[5]=300;
			precios[6]=300;
			precios[7]=200;
			precios[8]=500;
			precios[9]=300;
			precios[10]=300;
			precios[11]=200;
			
			
			int variable=1;
			int variable1=2;
			int variable2=3;
			
			
			
			
			buscarButaca(flags, precios, nombres, ventas, variable);
			buscarButaca(flags, precios, nombres, ventas, variable1);
			buscarButaca(flags, precios, nombres, ventas, variable2);

			
			
			for (int i=0; i<nombres.length; i++) {
				System.out.println(nombres[i]);
				System.out.println("Estado " +flags[i]+ " y precio: $"+precios[i]);
				
			}
			
			System.out.println(ventas);
			
					
		}

		private static void buscarButaca(boolean[] flags, int[] precios, String[] nombres, int ventas, int variable) {
			for (int i=0; i<nombres.length; i++) {
				if ((i==variable) && (flags[i] = true ) ) {
					flags[i]=false;
					ventas= ventas + precios[i];
					
				System.out.println("Se ocupo la butaca: "+ nombres[i]);
				
				}
				
								
				if ((i==variable) && (flags[i] == false) ) {
					System.out.println("La butaca: "+nombres[i]+ (" esta ocupada, avisar en boleteria"));
				}
			}
		}

	}

