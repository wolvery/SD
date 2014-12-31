package jogo;

import jogo.Ovelha.Estado;
import jogo.Personagem.Espaco;

public class Cerca extends Pastor{

	public Cerca(Espaco nomeEspaco, Casa casaPersonagem) {
		super(nomeEspaco, casaPersonagem);
		// TODO Auto-generated constructor stub
	}
	
	// Estado da cerca em relacao aos ataques do lobo.
	enum Estado{
		Destruida(2), Quebrada(1), Inteira(0);
		
		public int estadoCerca;
		
		Estado(int valor){
			estadoCerca = valor;
		}
	}
	
	private Estado nomeEstado;

	public int getNomeEstado() {
		return nomeEstado.estadoCerca;
	}
	/**
	 * @param nomeEstado the nomeEstado to set
	 */
	public void setNomeEstado(Estado nomeEstado) {
		this.nomeEstado = nomeEstado;
	}
	

	// Estado da cerca, quando ela é atacada.
		public void estadoCercaAtaque(Cerca cerca) {
			Espaco nomeEspaco = Espaco.Vazio;
			// Estado estado = Estado.Morto; valor 4
			int situacaoCerca = cerca.getNomeEstado();
			if (situacaoCerca == 1){
				setNomeEspaco(nomeEspaco);
			} else {
				if (situacaoCerca == 0){
					setNomeEstado(nomeEstado.Quebrada);
				} 
			}
		}
}
