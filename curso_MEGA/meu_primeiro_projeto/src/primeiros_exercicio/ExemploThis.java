package primeiros_exercicio;

public class ExemploThis {

	public static void main(String[] args) {
		
		CarroThis carro = new CarroThis();
		
		carro.modelo = "911";
		
		System.out.println("Modelo antes: " + carro.modelo);
		
		carro.alterarModelo("RS7");

		System.out.println("Modelo depois: " + carro.modelo);
		
	}

}
