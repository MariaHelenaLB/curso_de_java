package meu_primeiro_projeto;

public class Paciente {
	
	double peso;
	double altura;
	
	IMC calcularIndiceDeMassaCorporal() {
		IMC imc = new IMC();
		double indice = peso / (altura * altura);
		imc.indice = indice;
		
		if (indice < 18.5) {
			imc.abaixoDoPeso = true;
		} else if (indice < 25) {
			imc.pesoIdeal = true;
		} else {
			imc.obeso = true;
			
			if (indice < 30) {
				imc.grauObesiadade = "Acima do peso";
			} else if (indice < 35) {
				imc.grauObesiadade = "I";
			} else if (indice < 40) {
				imc.grauObesiadade = "II";
			} else {
				imc.grauObesiadade = "III";
			}
		}
		return imc;
	}
	
	
	/*
	double calcularIndiceDeMassaCorporal() {
		double imc = peso / (altura * altura);
		
		return imc;
	}
	*/
	}
 	
