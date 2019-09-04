package com.banking.softbank.config.db;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackages = "com.banking.softbank.repository")
public class MongoConfig extends AbstractMongoConfiguration {

    @Value("${spring.data.mongodb.host}")
    private String mongoDbHost;

    @Value("${spring.data.mongodb.port}")
    private int mongoDbPort;

    @Value("${spring.data.mongodb.database}")
    private String mongoDbName;

    @Override
    public MongoClient mongoClient() {
        return new MongoClient(mongoDbHost, mongoDbPort);
    }

    @Override
    protected String getDatabaseName() {
        return mongoDbName;
    }
}
