package code.projectantoanfinal.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping("/home")
    public String homepage() {
        return "home"; // Trả về home.html
    }

    @RequestMapping("login")
    public String loginPage(){
        return "login";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello"; // Trả về hello.html
    }

    @PreAuthorize("hasAuthority('USER')")
    @RequestMapping("/hellolo")
    public String hellolo() {
        return "hellolo"; // Trả về hello.html
    }

}
