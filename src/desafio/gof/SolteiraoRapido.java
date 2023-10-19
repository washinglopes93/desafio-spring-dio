package desafio.gof;

/**
 * Singleton 'Apressado'
 */
public class SolteiraoRapido {
	
	private static SolteiraoRapido instancia = new SolteiraoRapido();
	
	private SolteiraoRapido() {
		super();
	}
	
	public static SolteiraoRapido getInstancia() {
		return instancia;
	}
}
