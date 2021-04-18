package Exemplo;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {

	Scanner leia = new Scanner(System.in);
	
	int totalDias;
	int meses;
	int dias;
	int ano;
	
	System.out.println("Escreva o seu total de dias na terra: ");
	totalDias = leia.nextInt();
	
	ano = totalDias/365;
	meses = totalDias%365/30;
	dias = totalDias%365%30;
	
	System.out.println("Você tem em anos:"+ano+ "\ne um total de meses:"+ meses+ "\ne mais um total de dias:"+dias);
	
			
	

	
	}	
	
	
}
