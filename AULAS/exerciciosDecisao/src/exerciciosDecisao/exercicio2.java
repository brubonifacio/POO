package exerciciosDecisao;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int n1,n2,n3;
		
		System.out.println("Escreva o primeiro n�mero: ");
		n1 = leia.nextInt();
		System.out.println("Escreva o segundo n�mero: ");
		n2 = leia.nextInt();
		System.out.println("Escreva o terceiro n�mero: ");
		n3 = leia.nextInt();
		
		if (n1 < n2) {
			if (n2 < n3) {
				System.out.println(n1+"\n"+n2+"\n"+n3);
			}
			else if (n1 < n3) {
				System.out.println(n1+"\n"+n3+"\n"+n2);
			}
			else {
				System.out.println(n3+"\n"+n1+"\n"+n2);
			}
		}
		else if (n2 < n3) {
			if (n1 < n3) {
				System.out.println(n2+"\n"+n1+"\n"+n3);
			
			} else {
				System.out.println(n1+"\n"+n2+"\n"+n3);
			
			}
	}
			else {
				System.out.println(n3+"\n"+n2+"\n"+n1);
		}
	}

}
