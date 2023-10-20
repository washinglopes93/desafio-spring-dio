package desafio.gof;

import estrategia.Comportamento;
import estrategia.ComportamentoAgressivo;
import estrategia.ComportamentoDefensivo;
import estrategia.ComportamentoNormal;
import estrategia.Robo;

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
		
		//Strategy
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();

	}

}
