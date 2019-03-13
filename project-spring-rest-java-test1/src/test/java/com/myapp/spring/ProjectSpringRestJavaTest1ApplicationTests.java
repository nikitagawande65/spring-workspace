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

import com.myapp.spring.dao.IProjectDataAccess;
import com.myapp.spring.domain.Project;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;
 
@RunWith(SpringRunner.class)
//@SpringBootTest(classes=AnimalsSpringRestJavaTestApplication.class)
@WebMvcTest()
public class ProjectSpringRestJavaTest1ApplicationTests {
 
    @Autowired
    private MockMvc mockMvc;
 
    @MockBean
    private IProjectDataAccess projectService;
 
   // String exampleJson1 = "{\"id\":1,\"name\":\"cat\",\"tags\":[\"land\",\"cute\"],\"info\":{\"type\":\"mammal\",\"color\":\"red\"}}";
 
    String exampleProjectJson = "[{\"id\":1,\"pname\":metlife,\"pstartdate\":2018-12-12,"
    		+ "\"penddate\":2018-06-6,\"segment\":s1,\"category\":cat1,\"cfamily\":f1,"
    		+ "\"cspend\":\"cs1,\"psaving\":ps1,\"cmanager\":m1,\"blackbelt\":bb1,"
    		+ "\"stype\":st1,\"pstatus\":ps1\"}}]";
 
 
   /* @Test
    public void retrieveDetailsForProjects() throws Exception {
        List<Project> list=new ArrayList<>();
        Project project = new Project();
        project.setId(1);
        project.setname("metlife");
        project.setPstartdt("2018-12-12");
        project.setPenddate("2018-06-6");
        project.setSegment("s1");
        project.setCategory("cat1");
        project.setCfamily("f1");
        project.setCspend("cs1");
        project.setPsaving("ps1");
        project.setCmanager("cm1");
        project.setBlckbelt("bb1");
        project.setStype("st1");
        project.setPstatus("ps1");
        
        
        
       
        list.add(project);
        Mockito.when(
                projectService.findAll()).thenReturn(list);
 
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                "http://localhost:8080/projects").accept(
                MediaType.APPLICATION_JSON);
 
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
 
        System.out.println(result.getResponse());
       
 
        JSONAssert.assertEquals(exampleProjectJson, result.getResponse()
                .getContentAsString(), false);
        
       //Optional<Animal> a=dao.findById(id);
		
        
       
    }
*/    
 
    
  /*  @Test
    public void retrieveDetailsForAnimals1() throws Exception {
    	 List<Project> list=new ArrayList<>();
         Project project = new Project();
         project.setId(1);
         project.setPname("metlife");
         project.setPstartdate("2018-12-12");
         project.setPenddate("2018-06-6");
         project.setSegment("s1");
         project.setCategory("cat1");
         project.setCfamily("f1");
         project.setCspend("cs1");
         project.setPsaving("ps1");
         project.setCmanager("cm1");
         project.setBlckbelt("bb1");
         project.setStype("st1");
         project.setPstatus("ps1");
         
         
         
            //OR   Optional<Animal> optional=Optional.of(animal);
       
        list.add(project);
        
      //  Optional<Animal> a=dao.findById(id);
        
        Mockito.when(
        		//OR   animalService.findById(Mockito.anyInt).thenReturn(optional)); 
        		 projectService.findByName(Mockito.anyString())).
        thenReturn(java.util.Optional.of(project));
 
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                "http://localhost:8080/animals/metlife").accept(
                MediaType.APPLICATION_JSON);
 
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
 
        System.out.println(result.getResponse());
       
 
        JSONAssert.assertEquals(exampleProjectJson, result.getResponse()
                .getContentAsString(), false);
        
       
		
        
       
    }
    
 */
}