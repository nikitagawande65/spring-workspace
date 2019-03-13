package example
 
import groovyx.net.http.RESTClient
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification
 
 
 
@SpringBootTest(
       
       webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT
)
@ActiveProfiles(value = "test")
@ContextConfiguration
class FlightControllerSpec extends Specification {
 
   RESTClient restClient = new RESTClient("http://localhost:8888/")
 
   def "Check Flights controller"() {
       
 
       when: "get all flights"
       def response = restClient.get(path:'flights')
 
       then: "Status is 200"
       response.status == 200
 
       and: "Body contains proper values"
       assert response.data[0].sourceCity =='Bengaluru'
       assert response.data[0].destinationCity == 'Delhi'
       
   }
}