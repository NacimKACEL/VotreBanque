package com.finaxys.kata.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finaxys.kata.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, String> {

}
