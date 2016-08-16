package com.raquel.common;

public class Skill {
private String nomeSkill;

public String getNomeSkill() {
	return nomeSkill;
}

public void setNomeSkill(String nomeSkill) {
	this.nomeSkill = nomeSkill;
}
public void printSkill(){
	System.out.println("No momento você tem a seguinte habilidade:"+nomeSkill);
}
}
