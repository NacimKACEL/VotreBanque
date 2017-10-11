package com.finaxys.kata.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finaxys.kata.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
