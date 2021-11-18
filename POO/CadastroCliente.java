package POO;

public class CadastroCliente {
	public static void main(String args[]) {
		Cliente c1 = new Cliente();
		
		c1.setNomeCliente("Luiz");
		c1.setCodigoCliente(35678);
		System.out.println(c1.getNomeCliente());
		System.out.println(c1.getCodigoCliente());
		
	}

}
