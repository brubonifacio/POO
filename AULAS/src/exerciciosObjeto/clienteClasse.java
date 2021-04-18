package exerciciosObjeto;

import java.util.Scanner;

public class clienteClasse {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		cliente pessoa1 = new cliente();
		
		System.out.println("Escreva seu nome: ");
		pessoa1.nome = leia.next();
		System.out.println("Escreva sua idade: ");
		pessoa1.idade = leia.nextInt();
		System.out.println("Qual o seu pronome de tratamento? (1) Feminino - (2) Masculino - (3) Neutre ");
		pessoa1.genero = leia.next().charAt(0);
		System.out.println("Escreva seu CPF: ");
		pessoa1.CPF = leia.next();
		
		System.out.printf("Cliente: \n%s %s ",pessoa1.tratamento(), pessoa1.nome);
		System.out.printf("\nIdade: %d",pessoa1.idade);
		System.out.printf("\nSeu CPF: %s",pessoa1.CPF);
		
		
		

	}

}
