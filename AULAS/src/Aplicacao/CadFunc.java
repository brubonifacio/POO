package Aplicacao;

import java.util.Scanner;

import Classes.Pessoa;

public class CadFunc {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); //instanciar teclado
	
		Pessoa func1 = new Pessoa(); //instanciar pessoa
		Pessoa func2 = new Pessoa();
		
		System.out.println("Digite o nome do funcionário: ");
		func1.nome = leia.next();
		System.out.println("Digite o nome do segundo funcionário: ");
		func2.nome = leia.next();
		System.out.println("Digite o ano de nascimento do funcionário 1: ");
		func1.anoNascimento = leia.nextInt();
		System.out.println("Digite o ano de nascimento do segundo funcionário 1: ");
		func2.anoNascimento = leia.nextInt();
		System.out.println("Funcionario 1 escreva como se identifica: 1 - Feminino Sra. 2 - Masculino Sr. 3 - Outre Sre.");
		func1.genero = leia.next().charAt(0);
		System.out.println("Funcionario 2 escreva como se identifica: 1 - Feminino Sra. 2 - Masculino Sr. 3 - Outre Sre.");
		func2.genero = leia.next().charAt(0);
		
		
		System.out.printf("Idade pessoa 1 - %d anos\n",func1.calcularIdade());
		System.out.printf("Idade pessoa 2 - %d anos\n",func2.calcularIdade());
		
		if(func1.calcularIdade() < func2.calcularIdade()) {
			System.out.printf(" %s %s é a pessoa mais velha.",func2.tratamento(),func2.nome);
		} else {
			System.out.printf(" %s %s é a pessoa mais velha.",func1.tratamento(),func1.nome);
		}
		
		
		

	}

}
