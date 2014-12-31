package jogador;
/**
 * Valores para a ocupacao de alguma casa.
 * 
 * @author wolvery
 *
 */

public enum OcupacaoCasa {
	Vazia(0),Pastor(1),Ovelha(2),Lobo(3);
	private int valorOcupado;
	//Construtor
	private OcupacaoCasa(int valor) {
		valorOcupado = valor;
	}
	//Valor do enum de espaco ocupado.
	// Vazia ->0, Pastor>-1...
	public int getValorOcupado() {
		return valorOcupado;
	}
	
}
