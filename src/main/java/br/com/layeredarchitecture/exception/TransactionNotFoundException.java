package br.com.layeredarchitecture.exception;

import jakarta.persistence.EntityNotFoundException;

public class TransactionNotFoundException extends EntityNotFoundException {
    public TransactionNotFoundException(Long id) {
        super("Transaction not found with id " + id);
    }
}
