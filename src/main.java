
public class main {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		c1.setCpf(1);
		c1.setNome("William");
		
		Conta cc = new ContaCorrente(c1);
		cc.depositar(100);
		Conta poupanca = new ContaPoupanca(c1);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		

	}

}
