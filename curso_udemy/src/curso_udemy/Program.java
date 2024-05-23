package curso_udemy;

public class Program {

	public static void main(String[] args) {
		
		double price = 400.00;
		//double discount = 0; -> podemos fazer de outra forma:
		double discount;
		
		//você tem a garantia de que ou vai entrar no if ou vai entrar no else;
		if (price < 200.00) {
			discount = price * 0.1;
		} else {
			discount = 0;
		}
		
		System.out.println(discount);

	}

}
