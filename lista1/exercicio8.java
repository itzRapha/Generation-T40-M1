package lista1;

import java.util.Scanner;

public class exercicio8 {
	public static void main(String[] args) {
		
		double carro, soma = 0 ;
		
		Scanner calc = new Scanner(System.in);
		System.out.print("Informe o valor do carro:");
		carro = calc.nextFloat();
		
		soma = carro + (0.28*carro)+ (0.45*carro);
		
		System.out.printf("Custo do consumidor:  %.2f ",soma);
		
		calc.close();

	}

}
