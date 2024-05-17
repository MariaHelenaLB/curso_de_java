package meu_primeiro_projeto;

public class Principal6 {

	public static void main(String[] args) {
		
		Integer i1 = 127;
		Integer i2 = 127;
		
		Integer i3 = 128;
		Integer i4 = 128;
		
		//forma correta de fazer comparação
		System.out.println(i1.equals(i2));
		System.out.println(i3.equals(i4));
		
		//char \u0000 a \u007F esses valores char são armazenados em uma única variavel
		/*
		Integer i = new Integer(10);
		int x = i.intValue();
		
		int x = 10;
		Integer i = new Integer(10);
		byte b = i.byteValue();
		
		
		classes wrappers para cada tipo primitivo:
		
		byte   -   Byte
		short  -   Short
		int    -   Integer
		long   -   Long
		float  -   Float
		double -   Double
		char   -   Character
		*/
	}

}
