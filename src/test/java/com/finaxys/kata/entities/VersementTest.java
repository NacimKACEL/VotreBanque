package com.finaxys.kata.entities;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VersementTest {

	private Client client;
	private CompteCourant compteCourant;
	private Versement versement1;
	private Versement versement2;
	
	@Before
	public void initialize() throws Exception {
		client = new Client("nacim", "nacim.kacel@gmail.com");
		compteCourant = new CompteCourant("c1", new Date(), 90000, client, 500);
		versement1 = new Versement(new Date(), 90, compteCourant);
		versement2 = new Versement();
		
	}
	
	@After
	public void clean() throws Exception {
		client = null;
		compteCourant = null;
		versement1 = null;
		versement2 = null;
	}
	
	@Test
	public void Versement() {
		assertNotNull("The instance is not created", versement1);
		assertNotNull("The instance is not created", versement2);
	}
	
	@Test
	public void getMontant() {
	    assertTrue(90 == versement1.getMontant());
	    assertTrue(0 == versement2.getMontant());
	}
	
	@Test
	public void setMontant() {
		versement1.setMontant(100);
		assertTrue(100 == versement1.getMontant());
	    versement1.setMontant(0);
	    
	    versement2.setMontant(100);
		assertTrue(100 == versement2.getMontant());
	    versement2.setMontant(0);
	}

}
