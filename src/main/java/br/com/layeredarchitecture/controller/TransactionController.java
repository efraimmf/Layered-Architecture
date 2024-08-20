package br.com.layeredarchitecture.controller;

import br.com.layeredarchitecture.dto.TransactionDto;
import br.com.layeredarchitecture.model.Transaction;
import br.com.layeredarchitecture.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public ResponseEntity<List<Transaction>> getTransaction() {
        List<Transaction> transactions = transactionService.getTransaction();
        return ResponseEntity.ok(transactions);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transaction> getTransactionId (@PathVariable Long id) {
        Transaction transaction = transactionService.getTransactionId(id);
        return ResponseEntity.ok(transaction);
    }

    @PostMapping
    public ResponseEntity<Transaction> createTransaction (@RequestBody @Validated TransactionDto transactionDto) {
        Transaction newTransaction = transactionService.createTransaction(transactionDto);
        return ResponseEntity.ok(newTransaction);
    }
}
