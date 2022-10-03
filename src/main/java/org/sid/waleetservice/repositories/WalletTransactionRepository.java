package org.sid.waleetservice.repositories;

import org.sid.waleetservice.entities.Wallet;
import org.sid.waleetservice.entities.WalletTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletTransactionRepository extends JpaRepository<WalletTransaction,Long> {
}
