/**
 * Atributos comuns a personagens animaveis.
 * 
 * @author wolvery
 *
 */

public abstract class Personagem {
	private enum Espaco{
		Lobo(3),Ovelha(2),Pastor(1),Vazio(1);
		
		public int valorEspaco;
		Espaco(int valor){
			valorEspaco = valor;
		}
	}
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
		return nomeEspaco.valorEspaco;
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
