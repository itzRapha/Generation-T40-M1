package lista2_laco;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		int x;
		Scanner calc = new Scanner(System.in);
		System.out.print("informe um numero:");
		x = calc.nextInt();
		
		if(x%2==0) {
			System.out.print("numero par");
			System.out.printf("Raiz: "+ Math.sqrt(x));

		}else {
			System.out.print("numero ímpar");
			System.out.printf("Raiz: "+ Math.pow(x,2));
		}
		
		
		
		calc.close();

	}

}
