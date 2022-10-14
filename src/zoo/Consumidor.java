package zoo;

import zoo.animais.AbsAnimal;
import zoo.fabricas.AbsAnimalFactory;
import zoo.fabricas.ConcreteAnimalFactory;

public class Consumidor {

	public static void main(String[] args) {
		
		AbsAnimalFactory fabricaConcreta = new ConcreteAnimalFactory();
		
		AbsAnimal anta =  fabricaConcreta.fabricarMamifero("america");
		AbsAnimal arara = fabricaConcreta.fabricarAve("america");
		
		AbsAnimal leao =  fabricaConcreta.fabricarMamifero("africa");
		AbsAnimal grou = fabricaConcreta.fabricarAve("africa");
		
		anta.apresentarAnimal();
		arara.apresentarAnimal();
		
		leao.apresentarAnimal();
		grou.apresentarAnimal();
	}
}
