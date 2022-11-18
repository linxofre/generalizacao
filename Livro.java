package exercicio9_item;

public class Livro extends Item{
	private String autor;

	public Livro() {
		
	}
	public Livro(String autor) {
		setAutor(autor);
	}


	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor.length()> 0)
			this.autor = autor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livro [autor=");
		builder.append(autor);
		builder.append(", getAutor()=");
		builder.append(getAutor());
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
