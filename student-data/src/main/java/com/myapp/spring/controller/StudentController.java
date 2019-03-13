package com.myapp.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.myapp.spring.application.IStudentCommand;
import com.myapp.spring.domain.Student;

public class StudentController {
	 @Autowired
	    private IStudentCommand scommand;
	   
	 @ModelAttribute("student")
	    public Student formBackingObject() {
	        return new Student();
	    }
	 
	 @GetMapping("/link")
     public ModelAndView link() {
        
         ModelAndView mnv=new ModelAndView("link");
        
                     return mnv;
     }

 // http://localhost:8080/ibm/search
 @GetMapping("/show")
 @Transactional
 public ModelAndView show() {
    
     ModelAndView mndv=new ModelAndView();
     mndv.addObject("list",scommand.findAll());
     
     mndv.setViewName("show");
     return mndv;
 }
 
 @GetMapping("/studReg")
	public ModelAndView studentinsert() {
		ModelAndView mndv=new ModelAndView("studReg");
		return mndv;
	}
	
	@GetMapping("/add")
	@Transactional(propagation=Propagation.REQUIRED)
	public ModelAndView insert(Student student) {
		
		//String result = studentCommand.insert(student);
		ModelAndView mndv=new ModelAndView("link");
		mndv.addObject("student",scommand.add(student));
		
		return mndv;
	}

}
