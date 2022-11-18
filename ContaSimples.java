package exercicio9_conta_simples;

public class ContaSimples extends Conta{
	
	private double saldoPoupanca;
	
	public ContaSimples() {
		
	}
	public ContaSimples(double saldoPoupanca) {
		this.saldoPoupanca = 0;
		setSaldoPoupanca(saldoPoupanca);
	}
	
	public double depositoPoupanca() {
		this.saldoPoupanca = saldoPoupanca + valor;
		return saldoPoupanca;
	}
	public double saquePoupanca() {
		this.saldoPoupanca = saldoPoupanca - valor;
		return saldoPoupanca;
	}
	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", depositoPoupanca()=");
		builder.append(depositoPoupanca());
		builder.append(", saquePoupanca()=");
		builder.append(saquePoupanca());
		builder.append(", getSaldoPoupanca()=");
		builder.append(getSaldoPoupanca());
		builder.append(", deposito()=");
		builder.append(deposito());
		builder.append(", saque()=");
		builder.append(saque());
		builder.append(", getBanco()=");
		builder.append(getBanco());
		builder.append(", getAgencia()=");
		builder.append(getAgencia());
		builder.append(", getNumeroConta()=");
		builder.append(getNumeroConta());
		builder.append(", getSaldo()=");
		builder.append(getSaldo());
		builder.append(", getValor()=");
		builder.append(getValor());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}
	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}
	
	
	
}
