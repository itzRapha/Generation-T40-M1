package lista1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		int ano, mes,dia ,aux = 0;
		Scanner calc = new Scanner(System.in);
		System.out.print("Informe sua idade em anos:");
		ano = calc.nextInt();
		System.out.print("meses: ");
		mes = calc.nextInt();
		System.out.print("dias: ");
		dia = calc.nextInt();
		aux = dia + (ano*365) + (mes*30);
		System.out.printf("Idade em dias:%d ", aux);
        calc.close();

	}

}
