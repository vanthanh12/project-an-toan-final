package code.projectantoanfinal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import code.projectantoanfinal.entities.Person;

import code.projectantoanfinal.service.PersonService;



@Controller
public class HelloWorldController {
    
    @Autowired
	private PersonService personService ;

    @RequestMapping("/")
    public String index(Model model) {
        
    	List<Person> persons= personService.findAllPersons();
        model.addAttribute("persons", persons);
        return "index";
    }
    
    @RequestMapping("/home")
    public String homepage() {
        return "home"; // Trả về home.html
    }

   
    @RequestMapping("/hello")
    public String hello() {
        return "hello"; // Trả về hello.html
    }

}  
