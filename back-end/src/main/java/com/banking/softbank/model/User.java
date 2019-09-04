package com.banking.softbank.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.banking.softbank.model.enums.UserRole;

import lombok.Data;

@Data
@Document
public class User {
    @Id
    private String id;

    private String name;

    private UserRole role;

}
