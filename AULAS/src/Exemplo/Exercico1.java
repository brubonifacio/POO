package Exemplo;

import java.util.Scanner;

public class Exercico1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int meses;
		int dias;
		int idade;
		int totalDias;
		
		System.out.println("Escreva sua idade: ");
		idade = leia.nextInt();
		System.out.println("Escreva os meses: ");
		meses = leia.nextInt();
		System.out.println("Escreva os dias restantes: ");
		dias = leia.nextInt();
		
		totalDias = (idade*365) + (meses*30) + (dias);
		System.out.println(totalDias);
		
		
		
		
		
		
		
	}

}
