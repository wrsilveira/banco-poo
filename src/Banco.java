import java.util.List;

public class Banco {

	private int numero;
	private String nome;
	private List<Conta> contas;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero; 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
}
