package lista3_repetição;

import java.util.Scanner;

public class ex3{

	public static void main(String[] args) {
		int idade = 0,novo = 0,idoso = 0;
		Scanner calc = new Scanner(System.in);
		
		System.out.print("Informe a idade: ");
		idade = calc.nextInt();		
		
		while(idade>-99) {
			
			if(idade<21)
				novo++;
			else if(idade>70)
				idoso++;
			
			System.out.print("Informe a idade: ");
			idade = calc.nextInt();
		}
		
			
		System.out.printf("Menos de 21 anos: %d \nMais de 70 anos: %d",novo,idoso);
		calc.close();
	}
}
