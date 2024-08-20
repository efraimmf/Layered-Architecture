package br.com.layeredarchitecture.mapper;

import br.com.layeredarchitecture.dto.TransactionDto;

import br.com.layeredarchitecture.model.Transaction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
    Transaction createTransaction(TransactionDto transactionDTO);
}
