package primeiros_exercicio;

public class testeArrays {

	public static void main(String[] args) {
		//ARRAY Primitivo
		/*
		int x; variavel normal
		
		int[] notas; //variaveis array precisa dos: []
		notas = new int[4];
		*/ 
		
		//podemos fazer tudo em uma linha só também:
		int[] notas = new int [5];
		
		notas[0] = 10;
		notas[1] = 5;
		notas[2] = 8;
		notas[3] = 9;
		notas[4] = 10;
		
		System.out.println("Nota do primeiro aluno: " + notas[0]);
		System.out.println();
		
		System.out.println("Tamanho do array: " + notas.length);
		System.out.println();
		//outra maneira de exibir as notas
		for (int i = 0; i < notas.length; i++) { //length devolve o tamanho [5] que vem da linha 15
			System.out.println("Posição[" + i + "] = " + notas[i]);
		}
	}

}
