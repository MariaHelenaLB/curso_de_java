package meu_primeiro_projeto;

public class CarroDono {

	public static void main(String[] args) {
		Proprietario dono = new Proprietario();
		dono.nome = "Maria Helena Lima Barreto";
		dono.cpf = "000.000.000.-00";
		dono.idade = 25;
		dono.bairro = "Rua xxxxx xxxxx, 353";
		dono.cidade = "Guarulhos-SP";
		
		System.out.println("Nome: " + dono.nome );
		System.out.println("CPF: " + dono.cpf);
		System.out.println("Idade: " + dono.idade);
		System.out.println("Bairro: " + dono.bairro);
		System.out.println("Cidade: " + dono.cidade);
		
		Carro2 ProprietarioCarro = new Carro2();
		ProprietarioCarro.marca = "Audi";
		ProprietarioCarro.modelo = "RS7";
		ProprietarioCarro.fabricante = "Volkswagen";
		ProprietarioCarro.anoDeFabricacao = 2024;
		ProprietarioCarro.cor = "Roxo";
		ProprietarioCarro.dono = dono;
		
		System.out.println("Marca: " + ProprietarioCarro.marca);
		System.out.println("Modelo: " + ProprietarioCarro.modelo);
		System.out.println("Fabricante: " +  ProprietarioCarro.fabricante);
		System.out.println("Ano de fabricação: " + ProprietarioCarro.anoDeFabricacao);
		System.out.println("Cor: " + ProprietarioCarro.cor);
		System.out.println(ProprietarioCarro.dono);

	}

}
