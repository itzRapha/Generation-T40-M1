package lista1;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		float n1,n2,n3,media;
		Scanner calc = new Scanner(System.in);
		System.out.print("Insira as 3 notas do aluno:");
		
		n1 = calc.nextFloat();
		n2 = calc.nextFloat();
		n3 = calc.nextFloat();
		
		media = ((n1*2)+(n2*3)+(n3*5))/10;
		
		System.out.printf("\nMédia do aluno: %.1f ",media);
		
		calc.close();

	}

}

