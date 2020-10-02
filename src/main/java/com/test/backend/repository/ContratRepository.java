package com.test.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.backend.entities.Contrat;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Long> {

}
