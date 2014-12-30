import jogo.Casa;
import jogo.Pecas;

public class lobo {
    
    public void comerOvelha(Casa atual, Casa ovelha, Jogador numeroOvelhas) {
    	moverCasa(atual, ovelha);
    	numeroOvelhas--;
    }
    
    public void moverCasa(Casa atual, Casa proxima) {
            Pecas pecaLobo = atual.getPeca();
            atual.setPeca(null);
            
            proxima.setPeca(pecaLobo);     
    }
    
    void quebrarCerca(Casa atual, Casa cerca, Jogador forcaCerca) {
    	if(forcaCerca == 0)
    		moverCasa(atual, cerca);
    	else
    		forcaCerca--;
    }

}
