package primeiros_exercicio;

public class PacientePrincipal {

	public static void main(String[] args) {
		
		Paciente p = new Paciente();
		p.peso = 40;
		p.altura = 1.64;
		
		IMC imc = p.calcularIndiceDeMassaCorporal();
		
		System.out.println("Abaixo do peso ideal: " + imc.abaixoDoPeso);
		System.out.println("Peso ideal: " + imc.pesoIdeal);
		System.out.println("Obeso: " + imc.obeso);
		System.out.println("Grau de obesidade: " + imc.grauObesiadade);
		
		/*
		double imcCalculado = p.calcularIndiceDeMassaCorporal();
		
		System.out.println("IMC do paciente: " + imcCalculado);
		*/
		
	}

}
