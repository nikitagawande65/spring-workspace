package example
import grails.gorm.annotation.Entity
import grails.mongodb.MongoEntity

@Entity
class Flight implements MongoEntity<Flight>{


String sourceCity;

String destinationCity;

double fare;

double duration;
}