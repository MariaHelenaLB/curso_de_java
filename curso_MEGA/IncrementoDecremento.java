import java.util.Scanner;

public class IncrementoDecremento {
	
	public static void main(String[] args) {
		
		int idade = 18;
		int novaIdade = idade++; //++ -> indica que idade = idade + 1
		System.out.println("Idade: " + novaIdade);
		System.out.println("Nova idade: " + idade);
		
		int idade2 = 19;
		int novaIdade2 = idade2--; //++ -> indica que idade = idade + 1
		System.out.println("Idade: " + novaIdade2);
		System.out.println("Nova idade: " + idade2);
		
	}
	
}