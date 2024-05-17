public class OutrosOperadores {
	
	public static void main(String[] args) {
		
		int total = 10;
		total = total + 4;
		System.out.println(total);
		
		
		//também podemos fazer da seguinte forma:
		int total2 = 4;
		total2 += 4;
		System.out.println(total2);
		
		int total3 = 10;
		total3 += 3;
		System.out.println(total3);//imprime 13
	    total3 -= 2;
		System.out.println(total3);//imprime 11
		total3 *= 3;
		System.out.println(total3);//imprime 33
		total3 /= 3;
		System.out.println(total3);//imprime 11
		total3 %= 5;
		System.out.println(total3);// imprime 1
		
	}
	
}