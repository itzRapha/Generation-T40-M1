package lista1;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		int ano, mes,dia ,aux = 0;
		Scanner calc = new Scanner(System.in);
		System.out.print("Informe sua idade em dias:");
		aux = calc.nextInt();
		
		ano = aux/365;
		mes = (aux%365)/30;
		dia = (aux%365)%30;
		
		System.out.printf("Sua idade é :%d anos,%d meses e %d dias ", ano,mes,dia);
		
		calc.close();

	}

}
