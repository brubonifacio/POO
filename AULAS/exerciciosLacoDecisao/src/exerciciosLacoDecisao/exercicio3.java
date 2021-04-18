package exerciciosLacoDecisao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		int idadeInfantil;
		int idadeJuvenil;
		int idadeAdulto;
		
		System.out.print("Escreva a sua idade:");
		idadeInfantil=leia.nextInt();
		
		if (idadeInfantil==10 || idadeInfantil==11 || idadeInfantil==12 || idadeInfantil==13 || idadeInfantil==14 )
		{
			System.out.println("Você é do time infantil");
		}
		idadeJuvenil=leia.nextInt();
		
		if else (idadeJuvenil==15 || idadeJuvenil==16 || idadeJuvenil==17 ) 
		{
			System.out.println("Você é do time juvenil");
		}
		idadeAdulto=leia.nextInt();
		
		if else (idadeAdulto==18 || idadeAdulto==19 || idadeAdulto==20 || idadeAdulto==21 || idadeAdulto==22 ||idadeAdulto==23 ||idadeAdulto==24 ||idadeAdulto==25)
		{
			System.out.println("Você é do time adulto");
		}
				
				
	}
}
