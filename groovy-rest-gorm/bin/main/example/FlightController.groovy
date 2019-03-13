package example

import grails.gorm.transactions.ReadOnly
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@CompileStatic
class FlightController {

@Autowired
FlightService flightService

@RequestMapping("/flights")
@ReadOnly
List<Flight> flights() {
Flight.list()
}

@RequestMapping("/flights/{sourceCity}/{destinationCity}")
@ReadOnly
List<Flight> flights(@PathVariable("sourceCity")String sourceCity,@PathVariable("destinationCity")String destinationCity)
 {
flightService.findBySourceCityAndDestinationCity(sourceCity,destinationCity)
}
@RequestMapping(value="/flights",method=RequestMethod.POST)
String save(@RequestBody Flight flight)
{
flight.save()
}
}   