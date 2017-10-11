package com.finaxys.kata.metier;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finaxys.kata.dao.CompteRepository;
import com.finaxys.kata.dao.OperationRepository;
import com.finaxys.kata.entities.Compte;
import com.finaxys.kata.entities.CompteCourant;
import com.finaxys.kata.entities.Operation;
import com.finaxys.kata.entities.Retrait;
import com.finaxys.kata.entities.Versement;

@Service
@Transactional
public class BanqueMetierImpl implements IBanqueMetier {
	
	@Autowired
	private CompteRepository compteRepository;
	
	@Autowired
	private OperationRepository operationRepository;


	@Override
	public Compte consulterCompte(String codeCompte) {
		Compte  compte = compteRepository.findOne(codeCompte);
		if (compte == null) throw new RuntimeException("Compte introuvable"); //exception non surveillée  // creation des exception pro , exception metier 
		
		return compte;
	}

	@Override
	public void verser(String codeCompte, double montant) {
		Compte compte = consulterCompte(codeCompte);
		Versement versement = new Versement(new Date(), montant, compte);
		operationRepository.save(versement);
		compte.setSolde(compte.getSolde()+montant);
		compteRepository.save(compte);	
	}

	@Override
	public void retirer(String codeCompte, double montant) {
		Compte compte = consulterCompte(codeCompte);
		double facilitiesCaisse = 0;
		
		if (compte instanceof CompteCourant) 
			facilitiesCaisse =((CompteCourant) compte).getDecouvert();
		if ( compte.getSolde()+facilitiesCaisse < montant) throw new RuntimeException("Solde insuffisant");
		
		Retrait retrait = new Retrait(new Date(), montant, compte);
		operationRepository.save(retrait);
		compte.setSolde(compte.getSolde()-montant);
		compteRepository.save(compte);
	}

	@Override
	public void virement(String codeCompteInitiale, String codeCompteArrivee, double montant) {
		if (codeCompteInitiale.equals(codeCompteArrivee))  throw new RuntimeException("Virement impossible sur le meme compte ");
		retirer(codeCompteInitiale, montant);
		verser(codeCompteArrivee, montant);
	}

	@Override
	public Page<Operation> listOperation(String codeCompte, int page, int size) {
		
		return operationRepository.listOperation(codeCompte, new PageRequest(page, size));
	}

}
