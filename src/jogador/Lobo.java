package jogador;



/**
 * Classe para a personagem do Lobo.
 * @author wolvery
 *
 */

public class Lobo extends Personagem {
	//Estado do Lobo: Se ele esta comendo uma ovelha ou nao.	
	public static EstadoLobo estado ;
	
	public Lobo(Espaco espaco,Casa casaGerada){
		super(espaco, casaGerada);
		estado = EstadoLobo.Livre;
	}
	
    public void comerOvelha(EstadoLobo nomeEstado, Ovelha nomeOvelha) {
    	if (nomeEstado.equals (EstadoLobo.Livre)){
    		//diminuir o numero de ovelhas do jogador
    	}
    	else{
    		
    	}
    }
    
    public void moverCasa() {
  
    }
    
    public void quebrarCerca(EstadoLobo nomeEstado) {
    	if (nomeEstado.equals (EstadoLobo.Livre)){
    		//diminuir o numero de ovelhas do jogador
    	}
    	else{
    		
    	}
    }

}
