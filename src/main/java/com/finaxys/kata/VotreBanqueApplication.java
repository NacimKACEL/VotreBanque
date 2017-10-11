package com.finaxys.kata;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.finaxys.kata.dao.CompteRepository;
import com.finaxys.kata.dao.ClientRepository;
import com.finaxys.kata.dao.OperationRepository;
import com.finaxys.kata.entities.Client;
import com.finaxys.kata.entities.CompteCourant;
import com.finaxys.kata.entities.CompteEpargne;
import com.finaxys.kata.entities.Retrait;
import com.finaxys.kata.entities.Versement;
import com.finaxys.kata.metier.IBanqueMetier;

@SpringBootApplication
public class VotreBanqueApplication implements CommandLineRunner {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private CompteRepository compteRepository;
	
	@Autowired
	private OperationRepository operationRepository;
	
	@Autowired
	private IBanqueMetier banqueMetier;

	public static void main(String[] args) {
		SpringApplication.run(VotreBanqueApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		/*
		Client c1 = clientRepository.save(new Client("nacim", "nacim.kacel@gmail.com"));
		Client c2 = clientRepository.save(new Client("oualid", "oualid@gmail.com"));
		Client c3 = clientRepository.save(new Client("arnaud", "arnaul@gmail.com"));
		
		CompteCourant cp1 = compteRepository.save(new CompteCourant("c1", new Date(), 90000, c1, 500));
		CompteEpargne cp2 = compteRepository.save(new CompteEpargne("c2", new Date(), 90000, c1, 5.5));
		
		operationRepository.save( new Versement(new Date(), 900, cp1));
		operationRepository.save(new Versement(new Date(), 600, cp1));
		operationRepository.save( new Versement(new Date(), 1000, cp1));
		operationRepository.save(new Retrait(new Date(), 1000, cp1));
		
		operationRepository.save( new Versement(new Date(), 900, cp2));
		operationRepository.save(new Versement(new Date(), 600, cp2));
		operationRepository.save( new Versement(new Date(), 1000, cp2));
		operationRepository.save(new Retrait(new Date(), 1000, cp2));
		
		
		banqueMetier.verser("c1", 1000);
		banqueMetier.retirer("c1", 200);
		banqueMetier.virement("c1", "c2", 800);
		*/
	}
}



