
public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero += SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	@Override
	public void imprimirExtrato() {

	}

	protected void imprimirInformacoesConta() {
		System.out.println(String.format("Cliente: %s ", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d ", this.agencia));
		System.out.println(String.format("Numero: %d ", this.numero));
		System.out.println(String.format("Saldo: %.2f ", this.saldo));
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int conta) {
		this.numero = conta;
	}

	public double getSaldo() {
		return saldo;
	}
}
