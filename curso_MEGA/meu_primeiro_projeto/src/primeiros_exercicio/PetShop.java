package primeiros_exercicio;

public class PetShop {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.nome = "Pituxa";
		cachorro.idade = 9;
		cachorro.raca = "Pinscher";
		cachorro .sexo = 'F';
		
		System.out.println("Nome: " + cachorro.nome);
		System.out.println("Idade: " + cachorro.idade);
		System.out.println("Raça: " + cachorro.raca);
		System.out.println("Sexo: " + cachorro.sexo);
	}

}
