package com.banking.softbank.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.banking.softbank.model.User;

@Repository
public interface SimpleRepository extends MongoRepository<User,String> {
}
