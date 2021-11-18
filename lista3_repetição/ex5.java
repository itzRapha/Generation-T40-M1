package lista3_repetição;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		int x, soma=0;
		Scanner calc = new Scanner(System.in);
				
		do {
						
			System.out.println("Informe um numero: ");
			x = calc.nextInt();	
			soma=soma+x;
			
		}while(x!=0);
		System.out.printf("Soma: %d",soma);
		
		calc.close();
	}

}
