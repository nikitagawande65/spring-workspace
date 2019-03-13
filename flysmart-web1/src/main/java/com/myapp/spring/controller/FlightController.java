/*package com.myapp.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



//http://pastebin.com/q9L46BeA
@Controller
public class FlightController {

	//http://localhost:8080/ibm/home
	//here ibm is context
	@GetMapping("/home")
	public String home() {
	return "home";
	}
	
	//OR
	//oder version of spring MVC
	//@RequestMapping(method="get",value="/home")
	@GetMapping("/home")
	public ModelAndView home() {
		ModelAndView mndv=new ModelAndView("home");
	return mndv;
	}
                    
}
*/


package com.myapp.spring.controller;
 
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
 
import com.myapp.spring.application.IFlightCommand;
import com.myapp.spring.domain.Flight;
 
@Controller
public class FlightController {
   
    @Autowired
    private IFlightCommand command;
   
   
   
   
//  // http://localhost:8080/ibm/home
//  @GetMapping("/home")
//  public String home() {
//      return "home";
//  }
   
    // https://pastebin.com/QB4Q7GLg
   
   
    @ModelAttribute("flight")
    public Flight formBackingObject() {
        return new Flight();
    }
   
   
    // karthk11@in.ibm.com
    // http://localhost:8080/ibm/home
    // Older Versions of Spring MVC
    //@RequestMapping(method="get",value="/home")
    @GetMapping("/home")
        public ModelAndView home() {
           
            ModelAndView mnv=new ModelAndView("home");
           
                        return mnv;
        }
   
    // http://localhost:8080/ibm/search
    @GetMapping("/search")
    @Transactional
    public ModelAndView search(Flight flight) {
       
        ModelAndView mndv=new ModelAndView();
        mndv.addObject("flights",command.searchBySourceCityAndDestinationCity(flight.getSourcecity(),flight.getDestinationCity()));
        mndv.setViewName("home");
        return mndv;
    }
 
}