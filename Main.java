package exercicio9_conta_simples;

public class Main {

	public static void main(String[] args) {
		ContaSimples i = new ContaSimples (13.25);
		System.out.println(i);
		
		ContaEspecial l = new ContaEspecial(10, 88.7);
		l.setBanco("Itau");
		l.setAgencia(103);
		System.out.println(l);
		
	}

}
