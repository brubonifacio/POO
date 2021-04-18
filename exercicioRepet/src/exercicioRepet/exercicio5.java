package exercicioRepet;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		int numero=0;
		int soma=0;
		
		do {
			System.out.println("[Para finalizar o programa digite 0]\nDigite um número: ");
			numero = leia.nextInt();
			soma += numero;
			
		} while (numero != 0);
		System.out.println("A soma é: "+soma);

	}

	

}
