package application;

import java.util.Locale;
import java.util.Scanner;

import entity.conta;

public class testeConta {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		conta contajoao = new conta();
		
		System.out.println("Digite o numero da conta: ");
		contajoao.numero = leia.nextInt();
		System.out.println("Digite o CPF:");
		contajoao.CPF = leia.next();
		System.out.print("Digite o valor: ");
		double valor = leia.nextDouble();
		System.out.println("Operação: (1) Credito - (2) Debito");
		char opcao = leia.next().charAt(0);
		if (opcao=='1') {
			contajoao.credito(valor);
		}
		else if (opcao=='2') {
			contajoao.debito(valor);
		}
		
		
		System.out.printf("CPF: %s \n",contajoao.CPF);
		System.out.printf("Numero da conta: %d \n",contajoao.numero);
		System.out.printf("Saldo: %.2f \n",contajoao.saldo);
		
		
	}

}
