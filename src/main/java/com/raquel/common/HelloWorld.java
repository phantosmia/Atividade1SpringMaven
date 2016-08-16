package com.raquel.common;

public class HelloWorld implements Informacao{
	private String name;
	private Personagem personagem;

	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Hello ! " + name);
	}
	
	public String getInformacaoPersonagem() {
		// TODO Auto-generated method stub
 
		return "O nome do seu personagem é "+ personagem.getNomePersonagem() + " e seu gênero é"+personagem.getGeneroPersonagem();
	}


	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}
}
