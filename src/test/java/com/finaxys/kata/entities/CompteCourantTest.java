package com.finaxys.kata.entities;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CompteCourantTest {

	private Client client1;
	private Client client2;
	private CompteCourant compteCourant1;
	private CompteCourant compteCourant2;
	
	@Before
	public void initialize() throws Exception {
		client1 = new Client("nacim", "nacim.kacel@gmail.com");
		client2 = new Client("thibault", "tessertel@finaxys.com");
		compteCourant1 = new CompteCourant("c1", new Date(), 90000, client1, 500);
		compteCourant2 = new CompteCourant();
	}
	
	@After
	public void clean() throws Exception {
		client1 = null;
		client2 = null;
		compteCourant1 = null;
	}
	
	@Test
	public void CompteCourant() {
		assertNotNull("The instance is not created", compteCourant1);
		assertNotNull("The instance is not created", compteCourant2);
	}
	
	@Test
	public void getCodeCompte() {
	    assertEquals("The account code is incorrect", "c1", compteCourant1.getCodeCompte());
	    assertEquals("The account code is incorrect", null, compteCourant2.getCodeCompte());
	}
	
	@Test
	public void setCodeCompte() {
		compteCourant1.setCodeCompte("c2");
	    assertEquals("The name is incorrect", "c2", compteCourant1.getCodeCompte());
	    compteCourant1.setCodeCompte(null);
	    
	    compteCourant2.setCodeCompte("c2");
	    assertEquals("The name is incorrect", "c2", compteCourant2.getCodeCompte());
	    compteCourant2.setCodeCompte(null);
	}
	
	@Test
	public void getClient() {
	    assertEquals("The account client  is incorrect", client1, compteCourant1.getClient());
	}
	
	@Test
	public void setClient() {
		compteCourant1.setClient(client2);
	    assertEquals("The account client is incorrect", client2, compteCourant1.getClient());
	    compteCourant1.setClient(null);
	}
	
	
	
	@Test
	public void getSolde() {
	    assertTrue(90000 == compteCourant1.getSolde());
	    assertTrue( 0 == compteCourant2.getSolde());
	}
	
	@Test
	public void setSolde() {
		compteCourant1.setSolde(10000);
		assertTrue(10000 == compteCourant1.getSolde());
	    compteCourant1.setSolde(0);
	    
	    compteCourant2.setSolde(10000);
		assertTrue(10000 == compteCourant2.getSolde());
	    compteCourant2.setSolde(0);
	}
	
	@Test
	public void getDecouvert() {
		assertTrue(500 == compteCourant1.getDecouvert());
	    assertTrue( 0 == compteCourant2.getDecouvert());
	}
	
	@Test
	public void setDecouvert() {
		compteCourant1.setDecouvert(1000);;
		assertTrue(1000 == compteCourant1.getDecouvert());
	    compteCourant1.setDecouvert(0);
	    
	    compteCourant2.setDecouvert(1000);;
		assertTrue(1000 == compteCourant2.getDecouvert());
	    compteCourant2.setDecouvert(0);
	}

}
