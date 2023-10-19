package desafio.gof;

public class Testando {

	public static void main(String[] args) {
		//SingletonLazy
		SolteiraoPreguicoso preguica = SolteiraoPreguicoso.getInstancia();
		System.out.println(preguica);		
		preguica =  SolteiraoPreguicoso.getInstancia();
		System.out.println(preguica);
		
		//SingletonEager
		SolteiraoRapido ancioso = SolteiraoRapido.getInstancia();
		System.out.println(ancioso);
		ancioso = SolteiraoRapido.getInstancia();
		System.out.println(ancioso);
		
		//Singleton
		SolteiraoPreguicosoSegura espera = SolteiraoPreguicosoSegura.getInstancia();
		System.out.println(espera);
		espera = SolteiraoPreguicosoSegura.getInstancia();
		System.out.println(espera);

	}

}
