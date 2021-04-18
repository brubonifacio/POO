import java.util.Locale;
import java.util.Scanner;

public class desafio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		char aux=300,auxAnterior, chefa, bolsa, filhos=50;
		
		System.out.println("Já recebeu o auxilio? Sim(S) - Não(N) ");
		aux=leia.next().charAt(0);
		System.out.println("Recebe bolsa família? ");
		bolsa=leia.next().charAt(0);
		System.out.println("Você se declara chefa de familia?");
		chefa=leia.next().charAt(0);
		System.out.println("Quantos filhos você tem?");
		filhos=leia.next().charAt(0);
		System.out.println("Recebeu o auxilio anterior?");
		auxAnterior=leia.next().charAt(0);
		
		if (bolsa=='S' && chefa=='N')  {
			System.out.println("Não receberá o auxilio");
		}
		else if (chefa=='S' ) {
			System.out.println("");
			
		}

	}

}
