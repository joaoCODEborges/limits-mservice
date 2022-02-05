package com.in28minutes.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {

  /**
   * Connection to the database, and
   */
  CurrencyExchange findByFromAndTo(String from, String to);
}
