package lista2_laco;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner calc = new Scanner(System.in);
		int x,y,z,maior=0;
		System.out.print("informe tres valores: ");
		x = calc.nextInt();
		y = calc.nextInt();
		z = calc.nextInt();
		if(x>y && x>z)
			maior = x;
		else if(y>x && y>z)
			maior =y;
		else if(z>x && z>y)
			maior = z;
		System.out.printf("Maior: %d",maior);
		
		calc.close();
		

	}

}
