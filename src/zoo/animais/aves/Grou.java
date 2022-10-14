package zoo.animais.aves;

import zoo.animais.AbsAnimal;

public class Grou extends AbsAnimal {

	public Grou() {
		this.nome = "Grou";
		this.tipo = "ave";
		this.continente = "Africano";
	}
	
	public void apresentarAnimal() {
		super.apresentarAnimal();
		cantar();
	}
	
	public void cantar() {
		System.out.println("piu piu");
	}
}
