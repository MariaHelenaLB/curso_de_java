package meu_primeiro_projeto;

public class Principal {

	public static void main(String[] args) {
		Carro meuCarro= new Carro();
		meuCarro.marca = "Audi";
		meuCarro.modelo = "R8";
		meuCarro.fabricante = "Volkswagen";
		meuCarro.anoDeFabricacao = 2024;
		meuCarro.cor = "Vermelho";
		
		System.out.println("Marca: " + meuCarro.marca);
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Fabricante: " +  meuCarro.fabricante);
		System.out.println("Ano de fabricação: " + meuCarro.anoDeFabricacao);
		System.out.println("Cor: " + meuCarro.cor);
		
		Carro seuCarro= new Carro();
		seuCarro.marca = "Audi";
		seuCarro.modelo = "RS7";
		seuCarro.fabricante = "Volkswagen";
		seuCarro.anoDeFabricacao = 2024;
		seuCarro.cor = "Roxo";
		
		System.out.println("Marca: " + seuCarro.marca);
		System.out.println("Modelo: " + seuCarro.modelo);
		System.out.println("Fabricante: " +  seuCarro.fabricante);
		System.out.println("Ano de fabricação: " + seuCarro.anoDeFabricacao);
		System.out.println("Cor: " + seuCarro.cor);
	}

}
