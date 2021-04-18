package exercicioRepet;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

			
			Locale.setDefault(Locale.US);
			Scanner leia = new Scanner (System.in);
			
			double resultado=0.0;
			
			for (int numero = 1000; numero <= 1999; numero++) {
				if (numero % 11 == 5) {
					resultado = numero;
					System.out.printf("%.0f,",resultado);
					
				}
			}

	}

}
