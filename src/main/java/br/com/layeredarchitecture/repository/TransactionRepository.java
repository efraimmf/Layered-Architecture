package br.com.layeredarchitecture.repository;

import br.com.layeredarchitecture.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository <Transaction,Long> {
}
