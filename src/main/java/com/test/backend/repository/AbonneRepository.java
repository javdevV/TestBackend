package com.test.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.backend.entities.Abonne;

@Repository
public interface AbonneRepository extends JpaRepository<Abonne, Long> {

}
