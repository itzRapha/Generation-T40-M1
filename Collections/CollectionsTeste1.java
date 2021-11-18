package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionsTeste1 {
	public static void main(String args[]) {
		Collection<String> nomes = new ArrayList();
		//Add nomes
		nomes.add("Luiza");
		nomes.add("Julio");
		nomes.add("Maria");
		Collection<String> nomes2=Arrays.asList("João, Rafael");
		nomes.addAll(nomes2);
		System.out.println("Lista de nomes: " + nomes);
		
		//percorrer elementos
		for(String name : nomes)
			System.out.println("Lista de nomes: " + name);
		
		/*nomes.remove("Maria");

		if (nomes.isEmpty()) {
			System.out.println("Lista vazia...");
		} 
		else {
			System.out.println("Lista de nomes: " + nomes);
		}
		nomes.add("Gabriela");
		//verificar dados
		System.out.println("Contém o nome Gabriela?"+nomes.contains("Gabriela"));
		System.out.println("Lista?"+nomes);
*/
	}

}
