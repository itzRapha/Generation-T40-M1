package lista3_repeti��o;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		int p=0,i=0,f=0,m=0,o=0,c=0,n=0,a=0,idade;
		
		Scanner val = new Scanner(System.in);
		while(p>151) {
			System.out.print("Informe a idade: ");
			idade = val.nextInt();	

			System.out.println("Sou do sexo: ");
			System.out.println("1-Feminino ");
			System.out.println("2-Masculino ");
			System.out.println("3-Outros ");
			switch(i) {
			case '1':
				f++;
				break;
			case '2':
				m++;
				break;
			case '3':
				o++;
				break;
			default:
				System.out.println("n�mero inv�lido");
			}
			i=0;
			System.out.println("Sou uma pessoa : ");
			System.out.println("1-Calma");
			System.out.println("2-Nervosa ");
			System.out.println("3-Agressiva ");
			switch(i) {
				case '1':
					c++;
					break;
				case '2':
					n++;
					break;
				case '3':
					a++;
					break;
				default:
					System.out.println("n�mero inv�lido");
			
			}
			
		}
		System.out.printf("n�mero de pessoas calmas:%d ",c);
		System.out.println("n�mero de mulheres nervosas: ");
		System.out.println("n�mero de homens agressivos: ");
		System.out.println("n�mero de outros calmos: ");
		System.out.println("n�mero de pessoas nervosas com mais de 40 anos: ");
		System.out.println(" n�mero de pessoas calmas com menos de 18 anos:");
		val.close();
	}

}
