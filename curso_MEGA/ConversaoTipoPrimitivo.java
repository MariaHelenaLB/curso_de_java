public class ConversaoTipoPrimitivo {
	
	public static void main(String[] args) {
		long x = 1000000000L;
		
		//casting -> é a conversão de objetos ou tipos primitivos de um tipopara outro tipo.
		int y = (int) x;
		System.out.println(y);
		
		//outros exemplos
		int a = 102344;
		long b = a;
		System.out.println(b);
	
		double c = 20.5;
		float d = (float) c;
		System.out.println(d);
		
		float e = 934.5f;
		double f = e;
		System.out.println(f);
		
		double largura = 100;
		int tamanho = (int) largura;
		System.out.println(tamanho);
		
	}
	
}