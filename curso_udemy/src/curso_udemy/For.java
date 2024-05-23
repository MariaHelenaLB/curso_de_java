package curso_udemy;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int soma = 0;
//for (inicio(executa somente na primeira vez); condição(V: executa e volta / F: pula fora); incremento(executa toda vez depois de voltar)) {}
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}

		System.out.println(soma);

		sc.close();

	}

}
