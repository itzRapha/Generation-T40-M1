package lista1;

import java.util.Scanner;

public class exercico7 {
	public static void main(String[] args) {
		
		float a,b,c,d,e,f,x,y;
		Scanner calc = new Scanner(System.in);
		System.out.print("Informe 6 valores:");
		a = calc.nextFloat();
		b = calc.nextFloat();
		c = calc.nextFloat();
		d = calc.nextFloat();
		e = calc.nextFloat();
		f = calc.nextFloat();
		
		x = (c*e - b*f)/(a*e-b*d);
		y = (a*f-c*d)/(a*e-b*d);
		
		System.out.printf("X: %.2f \nY: %.2f",x,y);
		
		calc.close();
	}
}

		
