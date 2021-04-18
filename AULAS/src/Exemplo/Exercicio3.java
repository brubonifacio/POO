package Exemplo;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int totalSegundos;
		int horas;
		int minutos;
		int segundos;
		
		System.out.println("Escreva os segundos totais: ");
		totalSegundos = leia.nextInt();
		
		horas = totalSegundos/3600;
		minutos = totalSegundos%3600/60;
		segundos = totalSegundos%3600%60;
		
		System.out.println("O evento teve um total horas:"+horas+"\nE em minutos:"+minutos+"\nE por fim, em segundos:"+segundos);
	}

}
