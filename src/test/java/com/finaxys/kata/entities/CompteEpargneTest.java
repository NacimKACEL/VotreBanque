package com.finaxys.kata.entities;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CompteEpargneTest {

	private Client client1;
	private Client client2;
	private CompteEpargne compteEpargne1;
	private CompteEpargne compteEpargne2;
	
	@Before
	public void initialize() throws Exception {
		client1 = new Client("nacim", "nacim.kacel@gmail.com");
		client2 = new Client("thibault", "tessertel@finaxys.com");
		compteEpargne1 = new CompteEpargne("c1", new Date(), 90000, client1, 3.0);
		compteEpargne2 = new CompteEpargne();
	}
	
	@After
	public void clean() throws Exception {
		client1 = null;
		client2 = null;
		compteEpargne1 = null;
	}
	
	@Test
	public void CompteEpargne() {
		assertNotNull("The instance is not created", compteEpargne1);
		assertNotNull("The instance is not created", compteEpargne2);
	}
	
	@Test
	public void getCodeCompte() {
	    assertEquals("The account code is incorrect", "c1", compteEpargne1.getCodeCompte());
	    assertEquals("The account code is incorrect", null, compteEpargne2.getCodeCompte());
	}
	
	@Test
	public void setCodeCompte() {
		compteEpargne1.setCodeCompte("c2");
	    assertEquals("The name is incorrect", "c2", compteEpargne1.getCodeCompte());
	    compteEpargne1.setCodeCompte(null);
	    
	    compteEpargne2.setCodeCompte("c2");
	    assertEquals("The name is incorrect", "c2", compteEpargne2.getCodeCompte());
	    compteEpargne2.setCodeCompte(null);
	}
	
	@Test
	public void getClient() {
	    assertEquals("The account client  is incorrect", client1, compteEpargne1.getClient());
	}
	
	@Test
	public void setClient() {
		compteEpargne1.setClient(client2);
	    assertEquals("The account client is incorrect", client2, compteEpargne1.getClient());
	    compteEpargne1.setClient(null);
	}
	
	
	
	@Test
	public void getSolde() {
	    assertTrue(90000 == compteEpargne1.getSolde());
	    assertTrue( 0 == compteEpargne2.getSolde());
	}
	
	@Test
	public void setSolde() {
		compteEpargne1.setSolde(10000);
		assertTrue(10000 == compteEpargne1.getSolde());
	    compteEpargne1.setSolde(0);
	    
	    compteEpargne2.setSolde(10000);
		assertTrue(10000 == compteEpargne2.getSolde());
	    compteEpargne2.setSolde(0);
	}
	
	@Test
	public void getTaux() {
		assertTrue(3.0 == compteEpargne1.getTaux());
	    assertTrue( 0.0 == compteEpargne2.getTaux());
	}
	
	@Test
	public void setTaux() {
		compteEpargne1.setTaux(3.5);;
		assertTrue(3.5 == compteEpargne1.getTaux());
		compteEpargne1.setTaux(0.0);
	    
		compteEpargne2.setTaux(3.5);;
		assertTrue(3.5 == compteEpargne2.getTaux());
		compteEpargne2.setTaux(0.0);
	}

}
