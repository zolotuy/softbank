package com.banking.softbank.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.banking.softbank.model.enums.Currency;

import lombok.Data;

@Data
@Document
public class Account {
    @Id
    private String id;

    private long number;

    private float moneyCount;

    private Currency currency;

    private LocalDate expirationDate;

    private float creditLimit;
}
