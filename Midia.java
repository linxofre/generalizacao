package exercicio9_item;

public class Midia extends Item{
	
	private String gravadora;
	private float duracao;
	
	
	public Midia() {
		
	}
	public Midia(String gravadora, float duracao) {
		setGravadora(gravadora);
		setDuracao(duracao);
	}

	
	
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public float getDuracao() {
		return duracao;
	}
	public void setDuracao(float duracao) {
		if (duracao >0)
			this.duracao = duracao;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Midia [gravadora=");
		builder.append(gravadora);
		builder.append(", duracao=");
		builder.append(duracao);
		builder.append(", getGravadora()=");
		builder.append(getGravadora());
		builder.append(", getDuracao()=");
		builder.append(getDuracao());
		builder.append(", getCodigo()=");
		builder.append(getCodigo());
		builder.append(", getDescricao()=");
		builder.append(getDescricao());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
