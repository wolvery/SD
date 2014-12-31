package jogador;


/**
 * Atributos comuns a personagens animaveis.
 * 
 * @author wolvery
 *
 */

public abstract class Personagem {

	private Espaco nomeEspaco;
	private Casa casaPersonagem;
	
	public Personagem(Espaco nomeEspaco, Casa casaPersonagem) {
		super();
		this.nomeEspaco = nomeEspaco;
		this.casaPersonagem = casaPersonagem;
	}
	/**
	 * @return the nomeEspaco
	 */
	public int getNomeEspaco() {
		return nomeEspaco.getValorEspaco();
	}
	/**
	 * @param nomeEspaco the nomeEspaco to set
	 */
	public void setNomeEspaco(Espaco nomeEspaco) {
		this.nomeEspaco = nomeEspaco;
	}
	/**
	 * @return the casaPersonagem
	 */
	public Casa getCasaPersonagem() {
		return casaPersonagem;
	}
	/**
	 * @param casaPersonagem the casaPersonagem to set
	 */
	public void setCasaPersonagem(Casa casaPersonagem) {
		this.casaPersonagem = casaPersonagem;
	}
	
	
}
