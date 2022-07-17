package com.devanderson.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devanderson.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
