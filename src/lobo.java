
import jogador.Pecas;
/**
 * Classe para a personagem do Lobo.
 * @author wolvery
 *
 */

public class Lobo extends Personagem {
	//Estado do Lobo: Se ele esta comendo uma ovelha ou nao.
	private enum Estado{
		Livre(1),DigerindoOvelha(0);		
		public int estadoLobo;
		Estado(int valor){
			estadoLobo = valor;
		}
		
	}
	private Estado estado;
	
	public Lobo(Casa casaGerada){
		super("L", casaGerada);
		estado = Estado.Livre;
	}
	
    public void comerOvelha(Casa casaAtual, Casa casaDaOvelha) {
    	if (estado.equals (Estado.Livre)){
    		
    	}
    	else{
    		
    	}
    }
    
    public void moverCasa() {
  
    }
    
    void quebrarCerca(Casa atual, Casa cerca) {

    }

}
