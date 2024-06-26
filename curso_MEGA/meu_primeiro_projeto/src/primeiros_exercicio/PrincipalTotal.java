package primeiros_exercicio;
import java.util.Scanner;

public class PrincipalTotal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos produtos?");
		int quantidadeProdutos = entrada.nextInt();
		
		entrada.nextLine(); 
		
		Estoque estoque = new Estoque();
		

		estoque.produtos = new ProdutoEstoque[quantidadeProdutos];

		for (int i = 0; i < estoque.produtos.length; i++) {
			estoque.produtos[i] = new ProdutoEstoque();
			
			System.out.println("\nProduto " + i);
			System.out.println("------------------------");
			
			System.out.println("Descrição:");
			estoque.produtos[i].descricao = entrada.nextLine();
			
			System.out.println("Quantidade de itens:");			
			estoque.produtos[i].quantidade = entrada.nextInt();
			entrada.nextLine();
		}
		
		estoque.listarProdutos();
	}

}