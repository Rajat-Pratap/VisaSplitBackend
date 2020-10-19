package com.visasplit.visasplitbackend.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@ToString

@Document(collection = "Transaction")
public class Transaction {
    @Id
    private int transactionId;
    private int from;
    private int to;
    private double amount;
    private Date date;
    boolean success;

}
