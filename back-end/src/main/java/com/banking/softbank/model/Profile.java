package com.banking.softbank.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Profile {
    @Id
    private String id;

    private User user;

    private List<Account> accounts;

}
