package exerciciosDecisao;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Escreva um número: ");
		numero1 = leia.nextInt();
		System.out.println("Escreva um número: ");
		numero2 = leia.nextInt();
		System.out.println("Escreva um número: ");
		numero3 = leia.nextInt();
		
		if (numero1 >= numero2 && numero1 >= numero3) {
			System.out.println(numero1);
		}
		else if (numero2 >= numero1 && numero2 >= numero3) {
			System.out.println(numero2);
		}
		else if (numero3 >= numero1 && numero3 >= numero2) {
			System.out.println(numero3);
		}
		
		

	}

}
