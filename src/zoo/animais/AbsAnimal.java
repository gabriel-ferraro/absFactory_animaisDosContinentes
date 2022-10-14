package zoo.animais;

public abstract class AbsAnimal {

	public String nome;
	public String tipo;
	public String continente;
	
	public void apresentarAnimal() {
		System.out.printf("%s eh do continente %s e eh %s\n", this.nome, this.continente, this.tipo);
	}
}
