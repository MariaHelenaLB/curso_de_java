package primeiros_exercicio;

public class CarroThis {
	
	String marca;
	String fabricante; 
	String modelo; 
	String cor; 
	int anoDeFabricacao; 
	boolean bicombustivel; 
	
	Proprietario dono; 
	
	void alterarModelo(String modelo) {
		if (modelo != null) {
			this.modelo = modelo;
		}
	}
	
	
void ligar() {
		
		if (modelo == null) {
			return; //se não tiver um modelo não irá mostrar null e não irá mostrar nada na tela
		}
		
		System.out.println("Ligando o carro: " + modelo);
	}

}
