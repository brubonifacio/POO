import java.util.Locale;
import java.util.Scanner;

public class desafio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		char aux=300,auxAnterior, chefa, bolsa, filhos=50;
		
		System.out.println("J� recebeu o auxilio? Sim(S) - N�o(N) ");
		aux=leia.next().charAt(0);
		System.out.println("Recebe bolsa fam�lia? ");
		bolsa=leia.next().charAt(0);
		System.out.println("Voc� se declara chefa de familia?");
		chefa=leia.next().charAt(0);
		System.out.println("Quantos filhos voc� tem?");
		filhos=leia.next().charAt(0);
		System.out.println("Recebeu o auxilio anterior?");
		auxAnterior=leia.next().charAt(0);
		
		if (bolsa=='S' && chefa=='N')  {
			System.out.println("N�o receber� o auxilio");
		}
		else if (chefa=='S' ) {
			System.out.println("");
			
		}

	}

}
