import java.util.Locale;
import java.util.Scanner;

public class desafioLoja {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		final int ANO_ATUAL = 2021;
		
		String nome;
		char genero;
		int anoNascimento;
		int maiorIdade=0;
		int menorIdade=0;
		int mesmaIdade=0;
	    int idade=0;
		
		
		for(int i = 0; i < 2; i++) {
			System.out.printf("Digite o seu nome:", i+1);
			nome = leia.next();
			
			System.out.printf("%s Digite o ano de nascimento:  ",nome);
			anoNascimento = leia.nextInt();
			
			System.out.println("Digite seu genero F-feminino / M-masculino / O-outros");
			genero = leia.next().toUpperCase().charAt(0);
			
			idade = ANO_ATUAL - anoNascimento;
			
			if(idade > maiorIdade) {
				maiorIdade = idade;
			}
			
		}

	}

}
