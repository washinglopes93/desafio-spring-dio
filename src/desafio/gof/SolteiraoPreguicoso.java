package desafio.gof;

/**
 * Singleton "Preguicoso".
 */
public class SolteiraoPreguicoso {

	private static SolteiraoPreguicoso instancia;
	//Criando construtor em 5min44sec
	//Uma coisa que ele poderia ter falado que para gerar esse código automatico teria que apertar ctrl+space
	//Mas como eu fiz todas as aulas outros instruturoes explicaram isso!
	public SolteiraoPreguicoso() {
		super(); //Com ela ou sem ela o resultado vai ser o mesmo
	}
	//aqui é um metodo garantia fora dessa consigar instancia ela mesma
	public static SolteiraoPreguicoso getInstancia() {
		if(instancia == null) {
			instancia = new SolteiraoPreguicoso();
		}
		return instancia;
	}
}
