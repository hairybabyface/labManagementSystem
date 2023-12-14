package com.LabManagementSystem.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register_POST")
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("user")
    public UserDto userDto() {
        return new UserDto();
    }
	
	@PostMapping
	public String register_POST(@ModelAttribute("user") UserDto userDto) {
		userService.save(userDto);
		return "redirect:/registration?success";
	}
}
