package com.visasplit.visasplitbackend.repository;

import com.visasplit.visasplitbackend.models.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<Transaction,Integer> {
}
