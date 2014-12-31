package jogo;

import jogo.Personagem.Espaco;

/**
 * Classe responsavel pela personagem Ovelha.
 * @author wolvery
 *
 */

public class Ovelha extends Personagem {
	public Ovelha(Espaco nomeEspaco, Casa casaPersonagem) {
		super(nomeEspaco, casaPersonagem);
		// TODO Auto-generated constructor stub
	}

	// Estado da Ovelha em relacao a refeicao.
	enum Estado{
		Morto(4), Faminto(3), PoucaFome(2), Bem(1), Satisfeito(0);
		
		public int valorFome;
		
		Estado(int valor){
			valorFome = valor;
		}
	}
	
	// Vida da Ovelha em relacao ao ataque do lobo.
	enum Vida{
		Morto(2), Machucado(1), Vivo(0);
		
		public int valorVida;
		
		Vida(int valor){
			valorVida = valor;
		}
	}
	
	private Estado nomeEstado;
	private Vida situacaoVida;
	
	public int getNomeEstado() {
		return nomeEstado.valorFome;
	}
	/**
	 * @param nomeEstado the nomeEstado to set
	 */
	public void setNomeEstado(Estado nomeEstado) {
		this.nomeEstado = nomeEstado;
	}
	
	public int getEstadoVida() {
		return situacaoVida.valorVida;
	}
	
	public void setEstadoVida(Vida situacaoVida) {
		this.situacaoVida = situacaoVida;
	}
	
	// Estado da ovelha, se ela está mais que faminta, morre e é retirada.
	public void vidaOvelhaFome(Ovelha ovelha) {
		Espaco nomeEspaco = Espaco.Vazio;
		// Estado estado = Estado.Morto; valor 4
		int estadoOvelha = ovelha.getNomeEstado();
		if (estadoOvelha == 4){
			setNomeEspaco(nomeEspaco);
		} else {
			if (estadoOvelha == 3){
				setNomeEstado(nomeEstado.Faminto);
			} else {
				if (estadoOvelha == 2){
					setNomeEstado(nomeEstado.PoucaFome);
				} else {
					if (estadoOvelha == 1){
						setNomeEstado(nomeEstado.Bem);
					} else {
						setNomeEstado(nomeEstado.Satisfeito);
					}
				}
			}
		}
	}
	
	public void alimentarOvelha(Ovelha ovelha) {
		int estadoOvelha = ovelha.getNomeEstado();
			if (estadoOvelha == 3){
				setNomeEstado(nomeEstado.PoucaFome);
			} else {
				if (estadoOvelha == 2){
					setNomeEstado(nomeEstado.Bem);
				} else {
					if (estadoOvelha == 1){
						setNomeEstado(nomeEstado.Satisfeito);
					}
				}
			}
		}
	
	// Estado da ovelha, quando ela é atacada.
	public void vidaOvelhaAtaque(Ovelha ovelha) {
		Espaco nomeEspaco = Espaco.Vazio;
		// Estado estado = Estado.Morto; valor 4
		int vidaOvelha = ovelha.getEstadoVida();
		if (vidaOvelha == 1){
			setNomeEspaco(nomeEspaco);
		} else {
			if (vidaOvelha == 0){
				setEstadoVida(situacaoVida.Machucado);
			} 
		}
	}
	
}
