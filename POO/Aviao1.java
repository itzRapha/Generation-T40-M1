package POO;

public class Aviao1 {
	public static void main (String []args )
	{
		Aviao a1 = new Aviao();
		
		a1.setModelo("Airbus A380");
		a1.setQntdPassageiros(35678);
		a1.setTamAviao(72);
		System.out.println(a1.getModelo("Airbus A380"));
		System.out.println(a1.getQntdPassageiros(35678));
		System.out.println(a1.getTamAviao(72));
	}

}
