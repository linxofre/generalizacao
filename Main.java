package exercicio9_pessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("josé");
		System.out.println(p);
		
		PessoaFisico pf = new PessoaFisico("Ricardo");
		pf.setCpf("012.345.678-9");
		System.out.println(pf);

	}

}
