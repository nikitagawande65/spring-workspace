package com.myapp.spring;
 
import java.util.ArrayList;
import java.util.List;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
 
import com.myapp.spring.dao.IAnimalDataAccess;
import com.myapp.spring.domain.Animal;
import com.myapp.spring.domain.Animal.Info;
import com.myapp.spring.rest.api.AnimalRestApi;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;
 
@RunWith(SpringRunner.class)
//@SpringBootTest(classes=AnimalsSpringRestJavaTestApplication.class)
@WebMvcTest()
public class AnimalsSpringRestJavaTestApplicationTests {
 
    @Autowired
    private MockMvc mockMvc;
 
    @MockBean
    private IAnimalDataAccess animalService;
 
    String exampleAnimalsJson1 = "{\"id\":1,\"name\":\"cat\",\"tags\":[\"land\",\"cute\"],\"info\":{\"type\":\"mammal\",\"color\":\"red\"}}";
 
    String exampleAnimalsJson = "[{\"id\":1,\"name\":\"cat\",\"tags\":[\"land\",\"cute\"],\"info\":{\"type\":\"mammal\",\"color\":\"red\"}}]";
 
 
    @Test
    public void retrieveDetailsForAnimals() throws Exception {
        List<Animal> list=new ArrayList<>();
        Animal animal = new Animal();
        animal.setId(1);
        animal.setName("cat");
        animal.setTags(new String[] {"land","cute"});
        Info info=animal.new Info();
        info.setColor("red");
        info.setType("mammal");
        animal.setInfo(info);
       
        list.add(animal);
        Mockito.when(
                animalService.findAll()).thenReturn(list);
 
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                "http://localhost:8080/animals").accept(
                MediaType.APPLICATION_JSON);
 
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
 
        System.out.println(result.getResponse());
       
 
        JSONAssert.assertEquals(exampleAnimalsJson, result.getResponse()
                .getContentAsString(), false);
        
       //Optional<Animal> a=dao.findById(id);
		
        
       
    }
    
 
    
    @Test
    public void retrieveDetailsForAnimals1() throws Exception {
        List<Animal> list=new ArrayList<>();
        Animal animal = new Animal();
        animal.setId(1);
        animal.setName("cat");
        animal.setTags(new String[] {"land","cute"});
        Info info=animal.new Info();
        info.setColor("red");
        info.setType("mammal");
        animal.setInfo(info);
      //OR   Optional<Animal> optional=Optional.of(animal);
       
        list.add(animal);
        
      //  Optional<Animal> a=dao.findById(id);
        
        Mockito.when(
        		//OR   animalService.findById(Mockito.anyInt).thenReturn(optional)); 
        		 animalService.findById(Mockito.anyInt())).thenReturn(java.util.Optional.of(animal));
 
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                "http://localhost:8080/animals/1").accept(
                MediaType.APPLICATION_JSON);
 
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
 
        System.out.println(result.getResponse());
       
 
        JSONAssert.assertEquals(exampleAnimalsJson1, result.getResponse()
                .getContentAsString(), false);
        
       
		
        
       
    }
    
 
}