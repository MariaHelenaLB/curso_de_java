import java.util.Scanner;

public class OperadoresLogicos {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu peso: ");
		int peso = entrada.nextInt();
		
		System.out.print("Digite a sua altura: ");
		double altura = entrada.nextDouble();

		System.out.print("Sexo (1 para 'M' ou outro para 'F'): ");
		char sexo = entrada.nextShort() == 1 ? 'M' : 'F';
		
		double imc = peso / (altura * altura);
		
		 /*
		if (sexo == 'F' && imc < 19.1) {
			System.out.println("Abaixo do peso.");
		} else if (sexo == 'F' && imc <= 25.8) {
			System.out.println("Peso ideal.");
		} else if (sexo == 'F' && imc <= 27.3) {
			System.out.println("Um pouco acima do peso.");
		} else if (sexo == 'M' && imc <= 20.7) {
			System.out.println("Abaixo do peso.");
		} else if (sexo == 'M' && imc <= 26.4) {
			System.out.println("Peso ideal.")
		}
		*/
		
		// ______________A______________||______________b______________
		if ((sexo == 'F' && imc < 19.1) || (sexo == 'M' && imc < 20.7)) {
			System.out.println("Abaixo do peso.");
		} else if ((sexo == 'F' && imc < 25.8) || (sexo == 'M' && imc < 26.4)) {
			System.out.println("Peso ideal.");
		} else if ((sexo == 'F' && imc < 27.3) || (sexo == 'M' && imc < 27.8)) {
			System.out.println("Um pouco acima do peso.");
		}//continua...
	}
}
