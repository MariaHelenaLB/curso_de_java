package primeiros_exercicio;

public class PessoaBean {

	private String nome;
	private int idade;
	
	public PessoaBean() {
		
	}
	
/* 
	setter e getter precisam ser publico
	 
	A função de um método "set" é atribuir um valor ao campo correspondente. 
	A função de um método "get" é retornar o valor do campo correspondente. 
*/ 
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
