package com.raquel.common;

public class Personagem {
private String nomePersonagem;
public String getNomePersonagem() {
	return nomePersonagem;
}
public void setNomePersonagem(String nomePersonagem) {
	this.nomePersonagem = nomePersonagem;
}
public String getGeneroPersonagem() {
	return generoPersonagem;
}
public void setGeneroPersonagem(String generoPersonagem) {
	this.generoPersonagem = generoPersonagem;
}
public void printPersonagem(){
	System.out.println("O nome do seu personagem é:"+nomePersonagem);
	System.out.println("O gênero do seu personagem é "+generoPersonagem);
}
private String generoPersonagem;
}
