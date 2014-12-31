package jogo;
<<<<<<< HEAD
=======
import jogador.OcupacaoCasa;
>>>>>>> origin/master


public class Casa {
	/**
	 * Posicao atual da casa.
	 */
	private int posicaoX, posicaoY;
<<<<<<< HEAD

=======
	private OcupacaoCasa casaOcupada;
	/**
	 * Casa construtor.
	 */
	public Casa(int posicaoX, int posicaoY, OcupacaoCasa casaOcupada) {
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
		this.casaOcupada = casaOcupada;	
	}
	/**
	 * A casa esta ocupada por qual elemento.
	 * @return
	 */
	public OcupacaoCasa getCasaOcupada() {
		return casaOcupada;
	}
	/**
	 * Altera a ocupacao dessa casa.
	 * @param casaOcupada
	 */
	public void setCasaOcupada(OcupacaoCasa casaOcupada) {
		this.casaOcupada = casaOcupada;
	}
	
>>>>>>> origin/master
	/**
	 * @return the posicaoX
	 */
	public int getPosicaoX() {
		return posicaoX;
	}

	/**
	 * @param posicaoX the posicaoX to set
	 */
	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}

	/**
	 * @return the posicaoY
	 */
	public int getPosicaoY() {
		return posicaoY;
	}

	/**
	 * @param posicaoY the posicaoY to set
	 */
	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}
	
}
