package exerciciosDecisao;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int idadeJogador;
		
		System.out.println("Qual a sua idade? ");
		idadeJogador=leia.nextInt();
		
		if (idadeJogador >= 10 && idadeJogador <= 14 ) {
			System.out.println("Jogador na classe Infantil!");
		}
		else if (idadeJogador >= 15 && idadeJogador <= 17) {
			System.out.println("Jogador na classe Juvenil!");
		}
		else if (idadeJogador >= 18 && idadeJogador <=25) {
			System.out.println("Jogador na classe Adulto");
		}
		else {
			System.out.println("Idade não permitida!");
		}
		

	}

}
