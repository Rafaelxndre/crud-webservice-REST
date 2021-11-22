package com.devsuperior.springcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.springcrud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
