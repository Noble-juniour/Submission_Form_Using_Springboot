package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
	@Autowired
	usersRepo repo;
    @RequestMapping("/")
	public String details()
	{ 
    	return "kevin";
	}
	
    @RequestMapping("/details")
	public String details(Users users)
	{  
    	repo.save(users);
    	return "kevin";
	}
    @RequestMapping("/getdetails")
  	public String getdetails()
  	{ 
      	
      	return "ViewUsers";
  	} 	
    @PostMapping("/getdetails")
    
    public ModelAndView getdetails(@RequestParam int userid)
    {
    	ModelAndView mv = new ModelAndView("Retrieve");
        Users users = repo.findById(userid).orElse(null);
        mv.addObject(users);
        return mv;
    }
}