package classe;

public class Jantar {
	public static void main(String[] args) {
		
		Humano Pedro = new Humano();
		Pedro.nome = "Pedro";
		Pedro.peso = 70.0;
		
		Comida Arroz = new Comida();
		Arroz.nomeComida = "arroz";
		Arroz.pesoComida = 0.200;
		
		Comida Feijao = new Comida();
		Feijao.nomeComida = "feijão";
		Feijao.pesoComida = 0.200;
		
		Comida Frango = new Comida();
		Frango.pesoComida = 0.200;
		
		Pedro.Comer(Arroz);
		Pedro.Comer(Feijao);
		Pedro.Comer(Frango);
		
		System.out.print(Pedro.peso);
		
	}
}