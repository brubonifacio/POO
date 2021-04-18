package exercicioRepet;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		int idade=0;
		int totalPessoasMenos21=0;
		int totalPessoasMaior50=0;
		
		System.out.println("Digite as idades [Para finalizar, digite -99]");
		  
		while (idade != -99) {
			System.out.print("Digite sua idade: ");
			idade = leia.nextInt();
			if (idade > 0 && idade <= 20 ) {
				totalPessoasMenos21++;
			}
			if (idade >= 50) {
				totalPessoasMaior50++;
			}
		}
			System.out.println("Total de pessoas com menos de 21 anos: "+totalPessoasMenos21);
			System.out.println("Total de pessoas com mais de 50 anos: "+totalPessoasMaior50);
		
		
		
		
		
		
		

	}

}
