import java.util.Scanner;

public class PagamentoIpva {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o final da placa: ");
		int finalPlaca = entrada.nextInt();
		
		switch (finalPlaca) { //caso o final da placa for...
			case 1: 
				System.out.println("Vencimento dia 11 de Janeiro.");
				break;
			case 2:
				System.out.println("Vencimento dia 12 de Janeiro.");
				break; 
			default:
				System.out.println("Data de vencimento não encontrada, desculpe.");
		}
		
	}
	
}