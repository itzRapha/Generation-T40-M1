package lista2_laco;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		int idade;
		Scanner calc = new Scanner(System.in);
		System.out.print("informe a idade:");
		idade = calc.nextInt();
		
		if(idade>=10 && idade<14)
			System.out.print("Infantil");
		else if(idade>=15 && idade<=17)
			System.out.print("Juvenil");
		else if(idade>=18 && idade<=25)
		    System.out.print("Adulto");
		
		calc.close();

	}
}
