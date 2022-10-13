
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(" ");
		System.out.println(" === Extrato Conta Poupança === ");
		System.out.println("Conta Poupanca bonificacao saldo + 0.06% ao mes");
		super.imprimirInfosComum();		
	}

	@Override
	public void aplicaTarifa() {
		this.saldo += saldo * 0.06;
	
	}



}