package lista2_laco;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		int n1,n2,n3;
		Scanner calc = new Scanner(System.in);
		System.out.println("informe três números distintos: ");
		n1 = calc.nextInt();
		n2 = calc.nextInt();
		n3 = calc.nextInt();
		
		if(n1<=n2 && n1 <= n3 && n2 <= n3)
			System.out.printf("Ordem: %d | %d | %d",n1,n2,n3);
		else if(n1<=n2 && n1 <= n3 && n3 <= n2)
			System.out.printf("Ordem: %d | %d | %d",n1,n3,n2);
		else if(n2<=n1 && n2 <= n3 && n1 <= n3)
		    System.out.printf("Ordem: %d | %d | %d",n2,n1,n3);
		else if(n2<=n1 && n2 <= n3 && n3 <= n1)
		    System.out.printf("Ordem: %d | %d | %d",n2,n3,n1);
		else if(n3<=n1 && n3 <= n2 && n1 <= n2)
		    System.out.printf("Ordem: %d | %d | %d",n3,n1,n2);
		else if(n3<=n1 && n3 <= n2 && n2 <= n1)
		    System.out.printf("Ordem: %d | %d | %d",n3,n2,n1);
		
		calc.close();

	}
}