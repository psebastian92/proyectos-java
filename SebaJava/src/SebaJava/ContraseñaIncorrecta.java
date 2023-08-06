package SebaJava;

import java.util.Scanner;

public class ContraseñaIncorrecta {
	public static void main(String args[]) {
		Scanner datos = new Scanner(System.in);
		int contras;

		System.out.println("Escribi la contraseña numerica: ");
		contras = datos.nextInt();
		int intentos = 0;
		boolean flag = false;

		while (contras != 1234 && !flag) {

			intentos++;
			System.out.println("N° de intentos: " + intentos);
			System.out.println("\n");
			System.out.println("Volvé a ingresarla ");
			contras = datos.nextInt();
			
			if (intentos == 3) {
				System.out.println("Contraseña incorrecta, bobin ");
				flag = true;
			}

		}

		if (intentos != 3) {
			System.out.println("Contraseña correcta! ");
		} else {
			System.out.println("El usuario esta bloqueado");
		}
	}
}
