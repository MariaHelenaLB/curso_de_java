package primeiros_exercicio;

public class Pessoa1 {

	String nome;
	int idade;
	
	//construtor precisa ter o mesmo nome da classe
	Pessoa1(String nome) {
		this.nome = nome;
		//inicialização bem complicada de fazer...
	}
	
	Pessoa1(String nome, int idade) {
		this(nome); //deve ser a primeira construção dentro do construtor
		this.idade = idade;
	}
	
}
