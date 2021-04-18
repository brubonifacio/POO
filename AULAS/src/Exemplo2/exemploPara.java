package Exemplo2;

import java.util.Scanner;

public class exemploPara {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		final double HABITANTES = 3;  //final com letra maiuscula vai ser uma const. e não poderá mudar o valor no programa
		double salario=0.00;
		double numeroFilhos=0;    //tipo byte -127 ate 127 filhos
		double mediaSalario=0.00;
		double totalSalario=0.00; 
		double mediaFilhos=0.00;
		double totalFilhos=0.00;
		double maiorSalario=0.00;
		double percentualPessoasSalarioAte100=0.00;
		double contadorPessoasSalario100=0;
		double totalDePessoasAte100=0;
		
		//x++ = x = x + 1
		//%s = String
		//%d= int
		//%f = double
		for (int x=1; x<=HABITANTES; x++) {
			
			System.out.print("Informe o salário do habitante "+x+ "R$: ");
			//System.out.print("Informe o salário do habitante %d R$: ");
			salario = leia.nextDouble();
			System.out.print("Informe quantos filhos você tem: ");
			numeroFilhos = leia.nextDouble();
			
			totalFilhos = totalFilhos + numeroFilhos;
			totalSalario = totalSalario + salario;
			
			if (maiorSalario < salario) {
				maiorSalario = salario;
			}
			if(salario <= 100) {
				contadorPessoasSalario100++;
			}
		}
		mediaSalario = totalSalario / HABITANTES;
		mediaFilhos = totalFilhos / HABITANTES;
		percentualPessoasSalarioAte100 = (totalDePessoasAte100 / HABITANTES)*100;
		
		System.out.printf("\nTotal de salários R$%.2f",totalSalario);
		System.out.printf("\nMédia salários: R$ %f", mediaSalario);
		System.out.printf("\nPercentual de pessoas que ganham ate R$ 100.00 é de %");
		System.out.printf("\nMaior salario R$:" , maiorSalario);
		System.out.printf("\nTotal de filhos: ", numeroFilhos);
		System.out.printf("\nMedia de filhos: ",mediaFilhos );
		}
	}


