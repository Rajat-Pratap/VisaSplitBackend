package com.visasplit.visasplitbackend.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.swing.*;
import java.util.List;

@Getter
@Setter
@ToString

@Document(collection = "Users")
public class User {
    @Id
    private int userId;
    private String name;
    private String passwordHash;
    List<Group> Groups;
}
