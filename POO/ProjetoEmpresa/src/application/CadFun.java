package application;

import java.util.Locale;

import entities.Funcionario;
import entities.Terceiro;


public class CadFun {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		
		Funcionario func1 = new Funcionario("XO-0001", "GOHAN", 40,14.25);
		Terceiro terc1 = new Terceiro("XB-002","GOKU", 5.25);
		
		terc1.setHorasTrabalhadas(25);
		terc1.setValorHora(10);
		
		System.out.println(terc1.getNome()+" salario: R$ "+terc1.salario());
		
		System.out.println(func1.getNome()+ " salario: R$"+func1.salario());
		
		
			
		

	}

}


