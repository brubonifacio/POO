package Exemplo2;

import java.util.Locale;
import java.util.Scanner;

public class desafioNotas1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		double notas[] = new double [4];
		String nomes[] = new String [4];
		
		for(int x=0; x< nomes.length; x++) {
				System.out.println("Digite seu nome: ");
				nomes[x] = leia.next();
				System.out.println("Digite a nota do aluno: ");
				notas [x] = leia.nextDouble();
					
				}
		for (int x = 0; x < nomes.length; x++) {
			if (notas[x] < 5) {
				System.out.printf("%s - nota %.2f Ainda não!\n", nomes[x], notas[x]);
			}else if (notas[x] > 5) {
				System.out.printf("%s - nota %f Muito bom!", nomes[x], notas[x]);
			}
					
			}
				
				
				
				
		
	}

}
