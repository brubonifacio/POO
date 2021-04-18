package Classes;

public class Pessoa {
	
	//classes
	//inicio
	//atributos [é/ter/estar]
	
	public String nome;
	public int anoNascimento;
	public char genero; // 1 - Feminino Sra. 2 - Masculino Sr. 3 - Outre Sre.
	
	//metodos [faz]
	public int calcularIdade() {
		return 2021 - anoNascimento;
		
	}
	//sobrecarga
	public int calcularIdade(int anoAtual) {
		return anoAtual - anoNascimento;
		
	}
	public String tratamento() {
		//1 - Feminino Sra. 2 - Masculino Sr. 3 - Outre Sre.
		String saida="";
		if(genero == '1') {
			saida = "Sra.";
		}
		else if(genero == '2') {
			saida = "Sr.";
		}
		else if(genero == '3') {
			saida = "Sre.";
		}
		return saida;
	}
	
}
