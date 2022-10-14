package zoo.animais.mamiferos;

import zoo.animais.AbsAnimal;

public class Leao extends AbsAnimal {

	public Leao() {
		this.nome = "Leao";
		this.tipo = "mamifero";
		this.continente = "Africano";
	}
	
	public void apresentarAnimal() {
		super.apresentarAnimal();
		rugir();
	}
	
	public void rugir() {
		System.out.println("roaaaaar");
	}
}
