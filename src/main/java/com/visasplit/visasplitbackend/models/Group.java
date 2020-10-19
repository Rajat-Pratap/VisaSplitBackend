package com.visasplit.visasplitbackend.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@ToString

@Document(collection = "Groups")
public class Group {
    @Id
    private int groupId;
    private List<User> members;
    private List<Transaction> transactions;
}
