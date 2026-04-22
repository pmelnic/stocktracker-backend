package com.stocktracker.backend.repositories;

import com.stocktracker.backend.models.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
    Optional<Currency> findByName(String name);
    boolean isCrypto(String name);
}
