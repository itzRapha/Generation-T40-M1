package PolimorfismoHeranca;

public class Animal {
	private String nome;
	private int idade;
	private boolean som;
	
	public String getNome(String nome) {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade(int idade) {
		return idade;
	}
	public void setIdade(int nome) {
		this.idade = idade;
	}
	public void EmiteSom() {
		if(this.som==true)
			System.out.println("Emite som");
		else
			System.out.println("Não emite mite som");
	}
}


