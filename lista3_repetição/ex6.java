package lista3_repetição;
import java.util.Scanner;
public class ex6 {

	public static void main(String[] args) {
		int x, soma=0,cont=0;
		float media=0;
		Scanner calc = new Scanner(System.in);
				
		do {		
			System.out.println("Informe um numero: ");
			x = calc.nextInt();	
			if(x%3==0 && x!=0) {
				soma=soma+x;
				cont++;			
			}
			
			
		}while(x!=0);
		media=(soma)/cont;
		System.out.printf("media: %.2f",media);
		calc.close();

	}

}
