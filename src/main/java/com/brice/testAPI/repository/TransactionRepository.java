package com.brice.testAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.brice.testAPI.model.Transaction;


@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long>{

}
