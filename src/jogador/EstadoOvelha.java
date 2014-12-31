package jogador;

public enum EstadoOvelha{
	Faminto(3),PoucaFome(2),Bem(1),Satisfeito(0);
	
	public int valorFome;
	EstadoOvelha(int valor){
		valorFome = valor;
	}
}
