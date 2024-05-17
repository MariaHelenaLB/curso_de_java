import java.util.Scanner;

public class ExemploContinue {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int divisor = entrada.nextInt();
		
		for (int i = 100; i <= 200; i++) {
			if(i % divisor == 0) {
				continue; // se ele encontrar um divisor ele continua
			}	
			System.out.println(i); // se não encontrar ele chega nessa parte
		}
		
		System.out.println("Fim do programa!");
	}
	
}