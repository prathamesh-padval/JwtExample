package com.dev.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.entity.Currency;

@Repository
public interface CurrencyRepo extends JpaRepository<Currency, Long> {
	
}
