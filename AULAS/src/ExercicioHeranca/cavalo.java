package ExercicioHeranca;

public class cavalo extends Animal {
	
	
	
	public cavalo(String nome, int idade) {
		super(nome, idade);
	
	}

	public void emitirSom()
	{
		System.out.println("IRRRIINN");
	}
	
	public void correr()
	{
		System.out.println("Cavalo correndo pocoto pocoto pocoto...");
	}
	

	public void infocavalo() {
		
		System.out.println("P� de pano ");
		System.out.println("Nome do cavalo"+getNome());
		System.out.println("Idade"+getIdade());
		
		
	}
}