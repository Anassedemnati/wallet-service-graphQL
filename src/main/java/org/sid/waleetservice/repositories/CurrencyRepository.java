package org.sid.waleetservice.repositories;

import org.sid.waleetservice.entities.Currency;
import org.sid.waleetservice.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency,String> {
}
