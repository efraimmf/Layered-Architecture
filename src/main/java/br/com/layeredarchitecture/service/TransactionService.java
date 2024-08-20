package br.com.layeredarchitecture.service;

import br.com.layeredarchitecture.dto.TransactionDto;
import br.com.layeredarchitecture.exception.TransactionNotFoundException;
import br.com.layeredarchitecture.mapper.TransactionMapper;
import br.com.layeredarchitecture.model.Transaction;
import br.com.layeredarchitecture.repository.TransactionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionMapper transactionMapper;
    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getTransaction(){
        return transactionRepository.findAll();
    }

    public Transaction getTransactionId (Long id){
        return transactionRepository.findById(id).orElseThrow(()
                -> new TransactionNotFoundException(id));
    }

    public Transaction createTransaction (TransactionDto transactionDto){
        Transaction transaction = transactionMapper.createTransaction(transactionDto);
        return transactionRepository.save(transaction);
    }
}