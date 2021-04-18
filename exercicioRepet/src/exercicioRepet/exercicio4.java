package exercicioRepet;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		final int LIMITE = 5;
		int idade;
		char sexo;
		char opcao;
		int contador=1;
		int pessoasCalmas=0;
		int mulheresNervosas=0;
		int homensAgressivos=0;
		int outrosCalmos=0;
		int pessoasNervosasMais40Anos=0;
		int pessoasCalmasMenos18Anos=0;
		
		
		System.out.println("Você deseja fazer a pesquisa? (S) Sim e (N) Não:");
		char continua = leia.next().toUpperCase().charAt(0);
		
		while(continua == 'S') {
			System.out.print("Informe sua idade:\n");
			idade = leia.nextInt();
			System.out.print("Digite 1-Feminino / 2-Masculino / 3-Outros:\n");
			sexo = leia.next().charAt(0);
			System.out.print("Digite: \n1- Se a pessoa for calma; \n2 - Se a pessoa era nervosa;\n3 - Se a pessoa for agressiva\n");
			opcao = leia.next().charAt(0);
			
			if(contador != LIMITE) {
				System.out.print("Você deseja fazer a pesquisa? (S)-Sim ou (N)-Não:\n");
				continua = leia.next().toUpperCase().charAt(0);
			}
			if (opcao == '1') {
				pessoasCalmas++;
			}
			if (sexo == '1' && opcao == '2') {
				mulheresNervosas++;
			}
			if (sexo == '2' && opcao == '3') {
				homensAgressivos++;
			}
			if(sexo == '3' && opcao == '1') {
				outrosCalmos++;
			}
			if(opcao == '2' && idade >= 40) {
				pessoasNervosasMais40Anos++;
			}
			if (opcao == '1' && idade < 18) {
				pessoasCalmasMenos18Anos++;
			}
			
			
			
			
			contador++;
		}
		
		System.out.println("Pessoas calmas: "+pessoasCalmas);
		System.out.println("Mulheres nervosas: "+mulheresNervosas);
		System.out.println("Homens agressivos: "+homensAgressivos);
		System.out.println("Outras pessoas calmas: "+outrosCalmos);
		System.out.println("Pessoas nervosas com mais de 40 anos: "+pessoasNervosasMais40Anos);
		System.out.println("Pessoas calmas com menos de 18 anos: "+pessoasCalmasMenos18Anos);
		
		System.out.println("Fim de programa. Obrigada!!!");
		

	}

}
