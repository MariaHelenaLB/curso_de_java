package meu_primeiro_projeto;

public class Carro3 {

	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao;
	boolean biCombustivel;
	
	Proprietario3 dono;
	
	void ligar() {
		
		if (modelo == null) {
			return; //se não tiver um modelo não irá mostrar null e não irá mostrar nada na tela
		}
		
		System.out.println("Ligando o carro: " + modelo);
	}

}
