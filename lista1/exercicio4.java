package lista1;

import java.util.Scanner;


public class exercicio4 {
	
	public static void main(String[] args) {
		double a,b,c,d=0,r,s;
		Scanner calc = new Scanner(System.in);
		System.out.print("Insira o valor para A, B e C: ");
		a = calc.nextDouble();
		b = calc.nextDouble();
		c = calc.nextDouble();
		
		r = Math.pow((a+b),2);
		s = Math.pow((b+c),2);
		d = (r+s)/2;
		
		System.out.printf("Resultado R: %.2f | S: %.2f | D: %.2f ",r,s,d);
		calc.close();
	}

}


