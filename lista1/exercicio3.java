package lista1;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		int seg, min,hora ,tempo = 0;
		Scanner calc = new Scanner(System.in);
		System.out.print("Informe a dura��odo evento em segundos:");
		tempo = calc.nextInt();
		
		hora = tempo/3600;
		min = (tempo%3600)/60;
		seg = (tempo%365)%30;
		
		System.out.printf("Dura��o do evento %d : %d : %d ",hora,min,seg);
		
		calc.close();

	}

}