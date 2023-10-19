package desafio.gof;

/**
 * Singleton "Lazy Holder"
 * 
 */

public class SolteiraoPreguicosoSegura {

	private static class InstanciaSegura {
		public static SolteiraoPreguicosoSegura instancia = new SolteiraoPreguicosoSegura();
	}	
	
	private SolteiraoPreguicosoSegura() {
		super();
	}
	
	public static SolteiraoPreguicosoSegura getInstancia() {
		return InstanciaSegura.instancia;		
	}
}
