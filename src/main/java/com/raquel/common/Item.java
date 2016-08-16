package com.raquel.common;

public class Item {
private String nomeItem;

public String getNomeItem() {
	return nomeItem;
}

public void setNomeItem(String nomeItem) {
	this.nomeItem = nomeItem;
}
public void printItem(){
	System.out.println("O item que você está carregando no momento é:"+nomeItem);
}
}
