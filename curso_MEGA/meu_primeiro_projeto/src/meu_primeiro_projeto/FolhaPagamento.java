package meu_primeiro_projeto;

public class FolhaPagamento {

	//double calcularSalario(int, int, double, double)
	double calcularSalario(int horasNormais, int horasExtras, double valorHoraNormal, double valorHoraExtra) {
		double valorHorasNormais = horasNormais * valorHoraNormal;
		double valorhorasExtras = horasExtras * valorHoraExtra;
		
		return valorHorasNormais + valorhorasExtras;
	}
	
}
