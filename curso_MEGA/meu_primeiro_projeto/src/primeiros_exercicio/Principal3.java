package primeiros_exercicio;

public class Principal3 {

	public static void main(String[] args) {
	Proprietario3 dono1 = new Proprietario3();
	dono1.nome = "MH";
	
	Carro3 meuCarro = new Carro3();
	meuCarro.modelo = "RS7";
	
	Carro3 seuCarro = new Carro3();
	//seuCarro.modelo = "A5";
	
	meuCarro.ligar();
	seuCarro.ligar();
	
	
	/*
	meuCarro.dono = dono1;
	seuCarro.dono = dono1;
	
	System.out.println("Antes da mudança");
	System.out.println(meuCarro.dono.nome);
	System.out.println(seuCarro.dono.nome);
	System.out.println(dono1.nome);
	
	meuCarro.dono.nome = "Maria Helena";
	
	System.out.println("Depois da mudança");
	System.out.println(meuCarro.dono.nome);
	System.out.println(seuCarro.dono.nome);
	System.out.println(dono1.nome);
	-----------------------------------------------------------------
	meuCarro.dono = dono1;
	
	meuCarro.dono.nome = "Maria Helena";
	
	System.out.println("meuCarro.dono.nome: " + meuCarro.dono.nome);
	System.out.println("dono1.nome: " + dono1.nome);
	*/
	
	}
}
