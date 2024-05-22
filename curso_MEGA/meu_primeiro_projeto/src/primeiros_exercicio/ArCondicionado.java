package primeiros_exercicio;

public class ArCondicionado {

	//quando coloca o private só vai funcionar dentro da classe
	private int temperatura;
	
	//public todos podem ver
	public void trocarTemperatura(int temperatura) {
		if (temperatura >= 17 && temperatura <=25) {
			this.temperatura = temperatura;
		}
	}
	
	public int obterTemperatura() {
		return temperatura;
	}
	
}
