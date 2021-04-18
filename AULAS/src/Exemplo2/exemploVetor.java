package Exemplo2;

import java.util.Locale;
import java.util.Scanner;

public class exemploVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		String nomes [] = new String[3]; 
		String nome1, nome2, nome3;
		
		nomes[0] = "PAULO";
		nome1 = "JOAO";
		nomes[1] = "MADALENA";
		nome2 = "MARIA";
		nome3 = "PEDRO";
		
		System.out.println(nome1);
		System.out.println(nome2);
		System.out.println(nome3);
		
		

	}

}
