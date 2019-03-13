package example

import grails.gorm.services.Service
import java.util.List
//flight is a entity 

@Service(Flight)
interface FlightService
{
List<Flight> findBySourceCityAndDestinationCity(String sourceCity,String destinationCity)
}