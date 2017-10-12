package com.finaxys.kata.entities;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RetraitTest {

	private Client client;
	private CompteCourant compteCourant;
	private Retrait retrait1;
	private Retrait retrait2;
	
	@Before
	public void initialize() throws Exception {
		client = new Client("nacim", "nacim.kacel@gmail.com");
		compteCourant = new CompteCourant("c1", new Date(), 90000, client, 500);
		retrait1 = new Retrait(new Date(), 90, compteCourant);
		retrait2 = new Retrait();
		
	}
	
	@After
	public void clean() throws Exception {
		client = null;
		compteCourant = null;
		retrait1 = null;
		retrait2 = null;
	}
	
	@Test
	public void CurrentAccount() {
		assertNotNull("The instance is not created", retrait1);
		assertNotNull("The instance is not created", retrait2);
	}
	
	@Test
	public void getMontant() {
	    assertTrue(90 == retrait1.getMontant());
	    assertTrue(0 == retrait2.getMontant());
	}
	
	@Test
	public void setAmount() {
		retrait1.setMontant(100);
		assertTrue(100 == retrait1.getMontant());
	    retrait1.setMontant(0);
	    
	    retrait2.setMontant(100);
		assertTrue(100 == retrait2.getMontant());
	    retrait2.setMontant(0);
	}

}
