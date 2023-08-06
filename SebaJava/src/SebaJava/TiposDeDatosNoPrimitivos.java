package SebaJava;

public class TiposDeDatosNoPrimitivos {

	public static void main (String args []) {
		/*DATOS NO PRIMITIVOS
		 Son datos que "etiquetan" a las variables, pero que 
		 necesitan ser "invocados". O sea, cuando usás uno 
		 de estos datos, al ponerle un "." después de su nombre,
		 te va a dar muchas opciones referidas a ese dato (mas
		 adelante lo vas a entender mejor). 
		 Acordate: variable es una palabrita que guarda
		 texto o números en la memoria de la pc.
		 
		 En el classroom te dejé cuáles son esos datos
		 no primitivos: Integer, String, Boolean, etc.
		 */
		
		// Ejemplo con frase
		
		String frase = "me gusta programar";
		/* la diferencia entre STRING y CHAR, es que 
		 STRING puede guardar una frase, pero char solo
		 UN solo símbolo.
		 */
		
		System.out.println(frase);
		
		// Ejemplo con números
		Integer edad = 18;
		System.out.println("Mi edad es "+edad); 
		/* Acordate: el "+" en la línea anterior, sirve 
		para separar una frase de un dato que quieras mostrar
		(primero salió en pantalla "Mi edad es" y le agregamos 
		al lado con el "+" la variable quedad, que es igual a 18)
		*/
	}
}
