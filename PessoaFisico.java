package exercicio9_pessoa;

public class PessoaFisico extends Pessoa {
	
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public PessoaFisico(String nome) {
		super(nome);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" - PessoaFisico [cpf = ");
		builder.append(cpf);
		builder.append("]");
		return builder.toString();
	}
	
	
}
