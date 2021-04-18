module Exercicios {

	import java.util.Scanner;

	public class ImpostoRenda {

		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			double salarioBruto, salarioLiquido, imposto;
			int tratamento;
			
			System.out.println("Como gostaria de ser tratado? 1- Sra. 2- SR. 3- Sre.");
			tratamento = leia.nextInt();
			System.out.println("Digite o seu salario bruto: ");
			salarioBruto = leia.nextInt();
			
			if (tratamento ==1){
				if (salarioBruto <=1200) {
		
				System.out.println("Sra. vc é isento!!");
				}
				else if (salarioBruto > 1200 && salarioBruto <=2500){
					imposto = salarioBruto * 0.12;
					salarioLiquido = salarioBruto-imposto;
					System.out.println("Sra. vc vai pagar 12% de IR R$ "+imposto+" seu salrio liquido "+salarioLiquido);
				} else if (salarioBruto > 2500) {
					imposto = salarioBruto * 0.25;
					salarioLiquido = salarioBruto-imposto;
					System.out.println("Sra. vc vai pagar 25% de IR R$ "+imposto+" seu salrio liquido "+salarioLiquido);
				}
			}
			else if (tratamento ==2){
				if (salarioBruto <=1200) {
		
				System.out.println("Sr. vc é isento!!");
				}
				else if (salarioBruto > 1200 && salarioBruto <=2500){
					imposto = salarioBruto * 0.12;
					salarioLiquido = salarioBruto-imposto;
					System.out.println("Sr. vc vai pagar 12% de IR R$ "+imposto+" seu salrio liquido "+salarioLiquido);
				} else if (salarioBruto > 2500) {
					imposto = salarioBruto * 0.25;
					salarioLiquido = salarioBruto-imposto;
					System.out.println("Sr. vc vai pagar 25% de IR R$ "+imposto+" seu salrio liquido "+salarioLiquido);
				}
			}
			else if (tratamento ==3){
				if (salarioBruto <=1200) {
		
				System.out.println("Sre. vc é isento!!");
				}
				else if (salarioBruto > 1200 && salarioBruto <=2500){
					imposto = salarioBruto * 0.12;
					salarioLiquido = salarioBruto-imposto;
					System.out.println("Sre. vc vai pagar 12% de IR R$ "+imposto+" seu salrio liquido "+salarioLiquido);
				} else if (salarioBruto > 2500) {
					imposto = salarioBruto * 0.25;
					salarioLiquido = salarioBruto-imposto;
					System.out.println("Sre. vc vai pagar 25% de IR R$ "+imposto+" seu salrio liquido "+salarioLiquido);
				}
			}
			

		}

	}


}