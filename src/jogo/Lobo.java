package jogo;

import jogador.Pecas;
import jogo.Ovelha.Vida;

/*
 * Classe para a personagem do Lobo.
 * @author wolvery
 *
 */

public class Lobo extends Personagem {
	//Estado do Lobo: Se ele esta comendo uma ovelha ou nao.
	private enum Estado{
		Livre(1), DigerindoOvelha(0);		
		public int estadoLobo;
		Estado(int valor){
			estadoLobo = valor;
		}
		
	}
	private Estado estado;
	
	public static Espaco espaco = Espaco.Lobo;
	
	public Lobo(Casa casaGerada){
		super(espaco, casaGerada);
		estado = Estado.Livre;
	}
	
    public void comerOvelha(Espaco nomeEspaco, Ovelha nomeOvelha) {
    	if (nomeEspaco.equals (Estado.Livre)){
    		//diminuir o numero de ovelhas do jogador
    	}
    	else{
    		nomeOvelha.vidaOvelhaAtaque(nomeOvelha);
    	}
    }
    
    public void moverCasa() {
  
    }
    
    public void quebrarCerca(Espaco nomeEspaco, Cerca nomeCerca) {
    	if (nomeEspaco.equals (Estado.Livre)){
    		//diminuir o numero de ovelhas do jogador
    	}
    	else{
    		nomeCerca.estadoCercaAtaque(nomeCerca);
    	}
    }

}
