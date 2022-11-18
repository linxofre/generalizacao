package exercicio9_item;

public class ItemMain {

	public static void main(String[] args) {

		Item i = new Item (1, "Abacate");
		System.out.println(i);
		
		Livro l = new Livro("Ricardo");
		l.setCodigo(103);
		l.setDescricao("um livro legal");
		System.out.println(l);
		
		Midia m = new Midia("som top", 23.5f);
		System.out.println(m);
		
		VHS vhs = new VHS("Um enigma do outro mundo");
		vhs.setCodigo(201);
		vhs.setDescricao("terror");
		vhs.setGravadora("Warner");
		vhs.setDuracao(23.6f);
		System.out.println(vhs);
		
		CD cd = new CD(10, "Andralls", "all hell make you better");
		cd.setCodigo(666);
		cd.setDescricao("Album");
		cd.setGravadora("inferno rockets");
		cd.setDuracao(68.6f);
		System.out.println(cd);
		
		
	}

}
