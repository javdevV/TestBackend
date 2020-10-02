package com.test.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.backend.entities.Adresse;

@Repository
public interface AdresseRepository extends JpaRepository<Adresse, Long> {

}
