package primeiros_exercicio;

public class Principal5 {

	public static void main(String[] args) {

		Proprietario dono5 = new Proprietario();
		dono5.nome = "João da Silva";
		
		Carro5 meuCarro = new Carro5();
		meuCarro.modelo = "RS7";
		
		/*
		meuCarro.dono = dono5;

		meuCarro.dono.nome = "MH";
		
		System.out.println("meuCarro.dono.nome: " + meuCarro.dono.nome);
		System.out.println("dono5.nome: " + dono5.nome);
		*/
		
		Carro5 seuCarro = new Carro5();
		seuCarro.modelo =  "A5";
		
		meuCarro.dono = dono5;
		seuCarro.dono = dono5;
		
		System.out.println("Antes da mudança");
		System.out.println(meuCarro.dono.nome);
		System.out.println(seuCarro.dono.nome);
		System.out.println(dono5.nome);
		
		System.out.println();
		
		meuCarro.dono.nome = "Rodrigo";
		
		System.out.println("Depois da mudança");
		System.out.println(meuCarro.dono.nome);
		System.out.println(seuCarro.dono.nome);
		System.out.println(dono5.nome);
	}

}
