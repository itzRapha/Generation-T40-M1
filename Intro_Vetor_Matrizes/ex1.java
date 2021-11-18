package Intro_Vetor_Matrizes;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		int media[]= new int[4];
		int i,soma=0;
		float m;
		Scanner ler = new Scanner(System.in);
		for(i=0;i<4;i++) {
			System.out.print("Digite a "+(i+1)+" Nota: ");
			media[i] = ler.nextInt();
			soma+=media[i];
		}
		m = soma/4;
		System.out.print("A média será:"+ m);
		ler.close();
	}

}
