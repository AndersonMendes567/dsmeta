package com.devanderson.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devanderson.dsmeta.entities.Sale;
import com.devanderson.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	public SaleRepository repository;

	public List<Sale> findSales() {
		return repository.findAll();
	}
	
	

}
