package com.myapp.spring.domain;
import grails.gorm.annotation.Entity
import.grails.mongodb.MongoEntity
@Entity
class Flight implements MongoEntity<Flight>{
@Id
BigInteger id;

String sourceCity;

String destinationCity;

double fare;

double duration;
}