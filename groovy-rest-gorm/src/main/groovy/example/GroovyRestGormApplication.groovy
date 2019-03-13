package example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import grails.gorm.transactions.Transactional
import org.springframework.boot.CommandLineRunner

@SpringBootApplication
class GroovyRestGormApplication implements CommandLineRunner {

	static void main(String[] args) {
		SpringApplication.run GroovyRestGormApplication, args
	}
	@Override
	@Transactional
	void run(String... args) throws Exception{
	new Flight(sourceCity:"Bengaluru",destinationCity:"Delhi",duration:3.5,fare:9600.4).save()
	new Flight(sourceCity:"Bengaluru",destinationCity:"Mumbai",duration:5.5,fare:5600.0).save()
	new Flight(sourceCity:"Bengaluru",destinationCity:"Delhi",duration:8.5,fare:4800).save()
	
	}
}
