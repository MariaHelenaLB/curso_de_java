public class OperadoresDeComparacaoEIgualdade {
	
	public static void main(String[] args) {
		
		//comparação: >, >=, <, <=
		//igualdade: == (igual), != (diferente)
		
		int a = 10; 
		int b = 5;
		int c = 2;
		
		boolean maior = b > a;
		boolean maiorOuIgual = b >= a;
		boolean menor = a < b;
		boolean menorOuIgual = a <= b;
		boolean igual = a == b -c;
		boolean diferente = a != c;
		
		System.out.println(maior);//false
		System.out.println(maiorOuIgual);//false
		System.out.println(menor);//false
		System.out.println(menorOuIgual);//false
		System.out.println(igual);//false
		System.out.println(diferente);//true
		
		//operador unario
		boolean bloqueado = false;
		bloqueado = !bloqueado;
		System.out.println(bloqueado);
		
		boolean bloqueado1 = !(b > a);//vai pegar o menor podemos simplificar utilzando a < b
		System.out.println(bloqueado1);
		
		
		
	}
	
}