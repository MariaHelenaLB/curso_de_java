package primeiros_exercicio;

public class Estoque {

	ProdutoEstoque[] produtos;
	
	void listarProdutos() {
		
		System.out.println("\nProdutos em estoque");
		System.out.println("------------------------");
		
		for (int i = 0; i < produtos.length; i++) {
			produtos[i].descrever();
		}
		
	}
	
}

/*

class Estoque {

	Produto[] produtos;
	
	void listarProdutos() {
		System.out.println("\nProdutos em estoque");
		System.out.println("------------------------");
				
		for (int i = 0; i < produtos.length; i++) {
			produtos[i].descrever();
		}
	}

}

*/