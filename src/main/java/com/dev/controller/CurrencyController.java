package com.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.entity.Currency;
import com.dev.repo.CurrencyRepo;

@RestController
@RequestMapping("/api")
public class CurrencyController {

	@Autowired
	CurrencyRepo repo;
	
	
	@GetMapping("/currencies")
	public List<Currency> findCurrencies(){
		return repo.findAll();
	}
	
	@PostMapping("/currencies")
	public void addCurrency(@RequestBody Currency currency) {
		repo.save(currency);
	}
	
	@PutMapping("/currencies")
	public void updateCurrency(@RequestBody Currency currency) {
		repo.save(currency);
	}
	
	@DeleteMapping("/currencies")
	public void deleteCurrency(@PathVariable Long id) {
		repo.deleteById(id);
	}
	
}
