
public class Main {

	public static void main(String[] args) {
		Cliente alexandre = new Cliente();
		alexandre.setNome("Alexandre");
		Conta cc  = new ContaCorrente(alexandre);
		Conta poupanca = new ContaPoupanca(alexandre);
		Conta salario = new ContaSalario(alexandre);
		salario.depositar(1500);
		salario.sacar(1501);
		cc.depositar(105);
		cc.aplicaTarifa();
		cc.transferir(45, poupanca);
		poupanca.aplicaTarifa();
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		salario.imprimirExtrato();
		
	}

}
