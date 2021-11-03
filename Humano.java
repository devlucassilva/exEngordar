package classe;

public class Humano {
	String nome;
	Double peso;
	Double pesoAntigo = peso;
	Double pesoComida;
	
	void Comer(Comida comida){
		this.peso += comida.pesoComida;
	}
	
}