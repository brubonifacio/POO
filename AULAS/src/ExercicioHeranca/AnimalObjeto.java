package ExercicioHeranca;

public class AnimalObjeto {

public static void main (String [] args) {
		
		
		cachorro dog = new cachorro("Gohan",3);
		dog.dadosCachorro();
		dog.correr();
		dog.emitirSom();
	
		
		
		cavalo horse = new cavalo ("Pé de pano",2);
		horse.infocavalo();
		horse.correr();
		horse.emitirSom();
		
		
		
		preguica p = new preguica ("Sid",2);
		p.infopreguica();
		p.subirArvore();
		p.emitirSom();
		
	}

}
