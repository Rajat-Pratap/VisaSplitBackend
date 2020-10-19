package com.visasplit.visasplitbackend.controllers;

import com.visasplit.visasplitbackend.models.Transaction;
import com.visasplit.visasplitbackend.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class TransactionController {

    @Autowired
    private TransactionRepository repository;

    @PostMapping("/api/doTransaction")
    public boolean doTransaction(@RequestBody Transaction transaction){
        repository.save(transaction);
        return true;
    }

    @GetMapping("/api/getTransaction{transactionId}")
    public Optional<Transaction> getTransaction(@PathVariable int transactionId){
        return repository.findById(transactionId);
    }
}
