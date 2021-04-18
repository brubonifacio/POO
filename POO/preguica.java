package ExercicioHeranca;

public class preguica extends Animal {
	
public preguica(String nome, int idade) {
	super(nome, idade);
}


public void subirArvore()
{
	System.out.println("Preguica subindo em arvores");
}

public void infopreguica() {
	
	
	System.out.println(" Dix");
	System.out.println("Nome da preguica"+getNome());
	System.out.println("Idade"+getIdade());
	
	
	
}
}
