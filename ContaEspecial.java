package exercicio9_conta_simples;

public class ContaEspecial extends Conta{
	private int diasSemJuros;
	private double limite;
	
	
	public ContaEspecial() {
		
	}
	public ContaEspecial(int diasSemJuros, double limite) {
		this.diasSemJuros = 0;
		setDiasSemJuros(diasSemJuros);
		setLimite(limite);
	}
	
	public int getDiasSemJuros() {
		return diasSemJuros;
	}
	public void setDiasSemJuros(int diasSemJuros) {
		this.diasSemJuros = diasSemJuros;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append("]");
		return builder.toString();
	}
	
	
}
