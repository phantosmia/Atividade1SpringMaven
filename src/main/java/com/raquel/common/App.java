package com.raquel.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");
    	Informacao info = (Informacao) context.getBean("helloBean");
    	System.out.println(info.getInformacaoPersonagem());
    	Personagem personagem = (Personagem) context.getBean("caracteristicasPersonagem");
    	personagem.printPersonagem();
    	Skill skill = (Skill) context.getBean("caracteristicasSkill");
    	skill.printSkill();
    	Item item = (Item) context.getBean("caracteristicasItem");
    	item.printItem();
    	
	
    }
}
