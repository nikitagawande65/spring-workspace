package com.myapp.spring
 
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
@SpringBootApplication
class FlysmartSpringRestGroovyApplication {
 
    static void main(String[] args) {
        SpringApplication.run FlysmartSpringRestGroovyApplication, args
    }
}
@RestController
class RestAPI{
 
@GetMapping
String api(){
return new Date().toString();
}
}