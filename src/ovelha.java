/**
 * Classe responsavel pela personagem Ovelha.
 * @author wolvery
 *
 */

public class Ovelha extends Personagem {
	// Estado da Ovelha em relacao a refeicao.
	private enum Estado{
		Faminto(3),PoucaFome(2),Bem(1),Satisfeito(0);
		
		public int valorFome;
		Estado(int valor){
			valorFome = valor;
		}
	}
	
	
}
