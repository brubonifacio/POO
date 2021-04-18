package exerciciosLacoDecisao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		int n1=0, n2=0, n3=0;
		
		System.out.print("Escreva um número: ");
		n1 = leia.nextInt();
		System.out.print("Mais um número: ");
		n2 = leia.nextInt();
		System.out.print("Último número: ");
		n3 = leia.nextInt();
		
		if (n1 < n2) 
		{
			if (n2 < n3)
		{
				System.out.println(n1+ "\n"+n2+"\n"+n3);
		}
			else if (n1 < n3)
		{
				System.out.println(n1+ "\n"+n3+"\n"+n2);	
		}   else {
			System.out.println(n3+ "\n"+n1+"\n"+n2);
		}
		}
		else if (n2 < n3)
		{
			if (n1 < n3 )
		{
				System.out.println(n2+ "\n"+n1+"\n"+n3);
		}
			else {
				System.out.println(n2+ "\n"+n3+"\n"+n1);
		}
		}
		else {
			System.out.println(n3+ "\n"+n2+"\n"+n1);
		}
				
		
		
	}

}
