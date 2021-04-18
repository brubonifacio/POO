package exerciciosObjeto;

public class produtoEletronico {

	public char categoria;
	public String marca;
	public double valor;
	public char tipoUso;
	public char portatil;
	
	
	public String lista() {
		String saida=""; 
		if(categoria =='1') {
			saida = "Celular";
	}
	else if(categoria == '2') {
		saida = "Notebook";
	}
	else if(categoria == '3') {
		saida = "Computador";
	}
		return saida;
	}
	public String levar() {
		String saida ="";
		if(portatil == '1') {
			saida = "Sim";
		}
		else if(portatil == '2') {
			saida = "Não";
			
		}
		return saida;
	}
	public String uso() {
		String saida ="";
		if(tipoUso == '1') {
			saida = "Pessoal";
		}
		else if(tipoUso == '2') {
			saida = "Comercial";
		}
		return saida;
	}
}
