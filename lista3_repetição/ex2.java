package lista3_repetição;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		int cont,x,i=0,j=0;
		
		Scanner var = new Scanner(System.in);
		
		for(cont=0;cont<10;cont++) {
			System.out.print("Informe um valor inteiro: ");
			x = var.nextInt();
			if(x%2==0)
				i++;
			else 
				j++;
		}			
		
		System.out.printf("Pares: %d \nImpares: %d",i,j);
		var.close();
				
	}

}