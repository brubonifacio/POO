package ExercicioHeranca;

public class AnimalObjeto {

public static void main (String [] args) {
		
		
		cachorro dog = new cachorro("Gohan",3);
		dog.dadosCachorro();
		dog.correr();
		
	
		
		
		cavalo horse = new cavalo ("P� de pano",2);
		horse.infocavalo();
		horse.correr();
		
		
		
		
		preguica p = new preguica ("Sid",2);
		p.infopreguica();
		p.subirArvore();
		
		
	}

}
