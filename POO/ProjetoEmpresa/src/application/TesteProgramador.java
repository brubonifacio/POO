package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.Terceiro;

public class TesteProgramador {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		List <Funcionario> lista = new ArrayList <> (); 
		
		System.out.println("CADASTRO DE FUNCIONARIOS - PAGAMENTOS");
		System.out.println("Quantos funcionarios ser�o cadastrados");
		
		int qtde = leia.nextInt();
		
		for(int x=1; x < qtde;x++) {
			System.out.printf("Funcionario %d\n",x);
			System.out.println("Digite 1 - Funcionario ou 2 - Terceiro: ");
			char tipo = leia.next().charAt(0);
			System.out.println("Digite a matricula:");
			String matricula = leia.next();
			System.out.println("Escreva seu nome:");
			String nome = leia.next();
			System.out.println("Horas trabalhadas");
			int horasTrabalhadas = leia.nextInt();
			System.out.println("Digite o valor por hora");
			double valorHora = leia.nextDouble();
			
			if (tipo == '2')
			{
				System.out.println("Digite o valor do adicional: R$");
				double adicional = leia.nextDouble();
				lista.add(new Terceiro(matricula, nome, horasTrabalhadas, valorHora, adicional));
				
			}
			else
			{
				lista.add(new Funcionario(matricula, nome, horasTrabalhadas, valorHora));
			}
		
		}
		System.out.println();
		System.out.println("Folha de pagamentos:");
		
		// FOR EACH
		for (Funcionario func: lista) {
			System.out.println(func.getNome()+"Salario R$: "+func.salario());
			
		}
		System.out.println("Fim de programa!!! ");
	}

}
