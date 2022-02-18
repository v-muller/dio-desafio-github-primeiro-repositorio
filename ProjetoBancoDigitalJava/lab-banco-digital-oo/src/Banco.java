import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List<Conta> contas = new ArrayList<Conta>();

	public Banco(){}

	public List<Conta> getContas() {
		return contas;
	}

	public boolean addConta(Conta conta){
		return  contas.add(conta);
	}

}
