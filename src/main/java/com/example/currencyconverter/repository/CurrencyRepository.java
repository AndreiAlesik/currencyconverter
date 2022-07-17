package com.example.currencyconverter.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends CrudRepository<com.example.currencyconverter.models.Currency, String> {

    @Override
    public Iterable<com.example.currencyconverter.models.Currency> findAll();
}

