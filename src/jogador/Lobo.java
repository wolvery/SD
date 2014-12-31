package jogador;

import jogo.Casa;

/**
 * Classe para a personagem do Lobo.
 * @author wolvery
 *
 */

public class Lobo extends Personagem {
	//Estado do Lobo: Se ele esta comendo uma ovelha ou nao.
	private EstadoLobo estado;
	
	public Lobo(Casa casaGerada){
		super("L", casaGerada);
		estado = Estado.Livre;
	}
	
    public void comerOvelha(Casa casaAtual, Casa casaDaOvelha) {
    	if (estado.equals (EstadoLobo.Livre)){
    		
    	}
    	else{
    		
    	}
    }
    
    public void moverCasa() {
  
    }
    
    void quebrarCerca(Casa atual, Casa cerca) {

    }

}
