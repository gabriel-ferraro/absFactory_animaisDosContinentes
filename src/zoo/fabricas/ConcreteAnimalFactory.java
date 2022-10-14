package zoo.fabricas;

import zoo.animais.AbsAnimal;
import zoo.animais.aves.Arara;
import zoo.animais.aves.Grou;
import zoo.animais.mamiferos.Anta;
import zoo.animais.mamiferos.Leao;

public class ConcreteAnimalFactory implements AbsAnimalFactory {

	@Override
	public AbsAnimal fabricarMamifero(String continente) {
		return (continente == "africa")? new Leao() : (continente == "america")? new Anta() : null;	
	}

	@Override
	public AbsAnimal fabricarAve(String continente) {
		return (continente == "africa")? new Grou() : (continente == "america")? new Arara() : null;
	}
}
