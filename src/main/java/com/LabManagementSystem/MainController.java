package com.LabManagementSystem;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.logging.Logger;

@Controller
public class MainController {

    private UserService userService;
    private static final Logger LOGGER = Logger.getLogger(LabManagementSystemApplication.class.getName());

    public MainController(UserService userService) {
        
        this.userService = userService;
    }

    // handler method to handle register button
    @GetMapping("/register")
    public String register(){
        return "register";
    }

    // handler method to handle user registration
    @PostMapping("/register")
    public String registration(@ModelAttribute("user") UserDto userDto,
                               BindingResult result,
                               Model model){

        LOGGER.info("MainController - registration"); // debug

        if(result.hasErrors()){
            model.addAttribute("user", userDto);
            return "/register";
        }

        userService.saveUser(userDto);

        return "redirect:/register?success";
    }
}
