
public class ContaSalario extends Conta{

	public ContaSalario(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(" ");
		System.out.println(" === Extrato Conta Salario === ");
		System.out.println("Conta salario isenta de tarifa");
		super.imprimirInfosComum();		
	}

	@Override
	public void aplicaTarifa() {
	
		
	}

}
