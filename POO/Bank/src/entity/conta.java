package entity;

public class conta {

	public String CPF;
	public int numero;
	public double saldo;
	public boolean ativa;
	
	public conta(int numero, String CPF) {
		this.numero = numero;
		this.CPF = CPF;
	}
	
	public void debito(double valor) {
		saldo = saldo - valor;
	}
	
	public void credito(double valor) {
		saldo = saldo + valor;
	}
}
