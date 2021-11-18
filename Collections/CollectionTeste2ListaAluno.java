package Collections;

import java.util.HashSet;
import java.util.Set;

public class CollectionTeste2ListaAluno {
	public static void main(String args[]) {
		Set<CollectionTeste2> conjunto = new HashSet<CollectionTeste2>();
		CollectionTeste2 a= new CollectionTeste2("Luiza Almeida","Java",6.5);
		CollectionTeste2 b= new CollectionTeste2("Rafael Souza";"Linux",8.5);
		conjunto.add(a);
		conjunto.add(b);
		System.out.println(conjunto);
	}

}
