package com.LabManagementSystem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    // handlers for GET requests
    @GetMapping("/login")
    public String getLoginHTML(){
        return "login";
    } 
    
    @GetMapping("/register")
    public String getRegisterHTML(){
        return "register";
    } 

    @GetMapping("/home")
    public String getHomeHTML(){
        return "home";
    }  
}
