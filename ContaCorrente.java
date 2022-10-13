
public class ContaCorrente extends Conta implements IConta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(" ");
		System.out.println(" === Extrato Conta Corrente === ");
		System.out.println("Conta Corrente possui tarifa de R$15,00 mensais.");
		super.imprimirInfosComum();

	}

	@Override
	public void aplicaTarifa() {
		double valor = 15d;
		this.saldo -= valor;

	}

}