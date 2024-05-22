package primeiros_exercicio;

public class TesteArrayComCarro {

	public static void main(String[] args) {
		
		/*
		 * Conseguimos ter arrays de todos os tipos, exemplo:
		int notas = new int[4];
		String[] st = new String[6];
		*/
		
		Carro[] carros = new Carro[4];
		carros[0] =new Carro();
		carros[0].anoDeFabricacao = 2024;
		
		System.out.println("Ano de fabricação: " + carros[0].anoDeFabricacao);
		
	}
	
}
