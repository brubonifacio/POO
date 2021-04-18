package exercicioRepet;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);

		double valores=0;
		double soma=0;
		double mediaMultiplos3=0;
		double contador=0;
		
		do {
			System.out.println("Digite os valores: ");
			valores = leia.nextDouble();
			if (valores % 3==0 && valores > 0)
			soma += valores;
			contador++;
		
		} while (valores !=0);
		mediaMultiplos3 = soma / contador;
		System.out.println("A soma dos valores é: "+mediaMultiplos3);
		
	}

	

}
