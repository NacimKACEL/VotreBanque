package com.finaxys.kata.entities;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClientTest {

	private Client client1;
	private Client client2;
	
	@Before
	public void initialize() throws Exception {
		client1 = new Client("nacim", "nacim.kacel@gmail.com");
		client2 = new Client();
	}
	
	@After
	public void clean() throws Exception {
		client1 = null;
		client2 = null;
	}
	
	@Test
	public void Client() {
		assertNotNull("The instance is not created", client1);
		assertNotNull("The instance is not created", client2);
	}
	
	@Test
	public void getNom() {
	    assertEquals("The name is incorrect", "nacim", client1.getNom());
	    assertEquals("The name is incorrect", null, client2.getNom());
	}
	
	@Test
	public void setNom() {
	    client1.setNom("thibault");
	    assertEquals("The name is incorrect", "thibault", client1.getNom());
	    client1.setNom(null);
	    
	    client2.setNom("thibault");
	    assertEquals("The name is incorrect", "thibault", client2.getNom());
	    client2.setNom(null);
	}
	
	@Test
	public void getEmail() {
	    assertEquals("The email is incorrect", "nacim.kacel@gmail.com", client1.getEmail());
	    assertEquals("The email is incorrect", null, client2.getEmail());
	}
	
	@Test 
	public void setEmail() {
	    client1.setEmail("tessertel@finaxys.com");
	    assertEquals("The name is incorrect", "tessertel@finaxys.com", client1.getEmail());
	    client1.setEmail(null);
	    
	    client2.setEmail("tessertel@finaxys.com");
	    assertEquals("The name is incorrect", "tessertel@finaxys.com", client2.getEmail());
	    client2.setEmail(null);
	}

}
