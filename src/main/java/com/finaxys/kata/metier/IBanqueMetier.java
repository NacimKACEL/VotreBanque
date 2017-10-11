package com.finaxys.kata.metier;

import org.springframework.data.domain.Page;

import com.finaxys.kata.entities.Compte;
import com.finaxys.kata.entities.Operation;

public interface IBanqueMetier {
	public Compte consulterCompte(String codeCompte);
	public void verser(String codeCompte, double montant);
	public void retirer(String codeCompte, double montant);
	public void virement(String codeCompteInitiale, String codeCompteArrivee, double montant);
	public Page<Operation> listOperation(String codeCompte, int page, int size);

}
