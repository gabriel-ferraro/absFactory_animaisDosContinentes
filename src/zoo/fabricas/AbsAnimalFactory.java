package zoo.fabricas;

import zoo.animais.AbsAnimal;

public interface AbsAnimalFactory {

	public AbsAnimal fabricarMamifero(String continente);
	public AbsAnimal fabricarAve(String continente);
}
