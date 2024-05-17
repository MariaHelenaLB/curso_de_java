import java.util.Scanner;

public class Escopo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a sua idade: ");
		int idade = entrada.nextInt();
		
		boolean podeDirigir = idade >= 18;
		String nomePai = "";
		
		if (!podeDirigir) { //mão pode dirigir
			System.out.print("Digite o nome do seu pai: ");
			
			nomePai = entrada.next();
		}
		
		System.out.println("Você pode dirigir?");
			
		if (podeDirigir) {
			System.out.println("Sim, claro");
		} else {
			System.out.println("Você não pode dirigir, se fizer isso " + nomePai + " irá levar uma multa!");
		}
	}
}