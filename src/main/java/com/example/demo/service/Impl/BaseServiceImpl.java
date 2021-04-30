package com.example.demo.service.Impl;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.example.demo.service.BaseService;

public class BaseServiceImpl implements BaseService {
    static AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();

    protected AmazonDynamoDB getClient(){
        return AmazonDynamoDBClientBuilder.standard().build();
    }
}
