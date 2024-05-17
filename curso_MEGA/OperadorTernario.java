import java.util.Scanner;

public class OperadorTernario {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		//operador ternario expressão booleana      valor caso verdadeiro               valor caso falso   
		String indicacao = (idade >= 18)        ?        "Adulto"          :          "Criança/Adolescente";
		
		/*EXEMPLOS SEM UTILIZAR OPERADOR TORNARIO
		int x = (idade >= 18) ? 1 : 2;
	
		*SEM UTILIZAR TERNARIO*
		if (idade >= 18) {
			indicacao = "Adulto";
		} else {
			indicacao = "Criança / Adolescente";
		}
		*/
		
		System.out.println("Resultado: " + indicacao);
		
	}
	
}