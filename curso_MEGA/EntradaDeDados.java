import java.util.Scanner;

public class EntradaDeDados {
	
	public static void main(String[] args) {
		
		/*
		Scanner entrada = new Scanner(System.in);
		 a classe Scanner é utilzada para poder receber a entrada dos dados na tela. 
		Para utilizar o Scanner é necessari ter a linha "import java.util.Scanner;"
		
		System.out.println("Digite o seu nome");
		String nome = entrada.nextLine(); 
		
		System.out.println("Olá " + nome);
		*/

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome completo: ");//sem ln no print não quebra uma linha. 
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu peso: ");
		int peso = entrada.nextInt();
		
		System.out.print("Digite a sua altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);//resolve os () primeiro
		
		System.out.println("IMC de " + nome + " é: " + imc);
		
		if (imc < 18.5){
			System.out.println(nome + ", você esta abaixo do peso ideal.");
			System.out.println("Cuidado!");
		} else if (imc < 25) {
			System.out.println(nome + ", você esta no peso ideal.");
		} else if (imc < 30) {
			System.out.println (nome + ", você esta acima do peso.");
		} else if (imc < 40) {
			System.out.println (nome + ", você esta com obesidade grau 1 ou 2.");
			System.out.println("Cuidado!");
		} else {
			System.out.println(nome + ", você esta com obesidade grau 3.");
			System.out.println("Muito cuidado!");
		}
		
	}
	
}