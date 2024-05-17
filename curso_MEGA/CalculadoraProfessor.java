public class CalculadoraProfessor {
	
	public static void main(String[] args) {
		
		//indica se o detalhamento deve ser apresentado na tela
		boolean calculoDetalhado = true;
		
		//constante do Pi
		float pi = 3.14f;
		
		//raio - informado pelo professor
		float raio = 5.3f;
		
		//area é igual raio ao quadrado multiplicad por Pi
		float area = raio * raio * pi;
		int areaSemCasasDecimais = (int) area;
		
		if (calculoDetalhado) {
			System.out.println("Area = " + raio + " * " + raio + " * " + pi);
		}
		System.out.println("O resultado é: " + area);
		System.out.println("O resultado sem casas decimais: " + areaSemCasasDecimais);
		
	}
	
}