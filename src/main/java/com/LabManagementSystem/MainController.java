package com.LabManagementSystem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    // handlers for GET requests
    @GetMapping("/index")
    public String getIndexHTML(){
        return "index";
    } 

    @GetMapping("/login")
    public String getLoginHTML(){
        return "login";
    } 

    @GetMapping("/login_success")
    public String getLoginSuccessHTML(){
        return "login_success";
    } 
    
    @GetMapping("/register")
    public String getRegisterHTML(){
        return "register";
    } 

    @GetMapping("/register_success")
    public String getRegisterSuccessHTML(){
        return "register_success";
    } 

    @GetMapping("/home")
    public String getHomeHTML(){
        return "home";
    }  
}
