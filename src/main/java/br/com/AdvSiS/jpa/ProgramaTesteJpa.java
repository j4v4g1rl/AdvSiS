package br.com.AdvSiS.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.AdvSiS.modelo.Menu;

public class ProgramaTesteJpa {

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		
		menu.setStrIdMenu("01");
		menu.setNomeMenu("CADASTRO");
		menu.setEnderecoMenu("CADASTRO.XHTML");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("AdvSiS");
		
		EntityManager em = emf.createEntityManager();
		
		em.close();
		emf.close();
		
		
	}

}
