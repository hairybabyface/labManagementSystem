package com.LabManagementSystem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
	private EquipmentService service; 

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

    @RequestMapping("/home")
	public String viewHomePage(Model model) {
		List<Equipment> listEquipment = service.listAll();
		model.addAttribute("listEquipment", listEquipment);
		
		return "home";
	}
	
	@RequestMapping("/new")
	public String showNewEquipmentPage(Model model) {
		Equipment equipment = new Equipment();
		model.addAttribute("equipment", equipment);
		
		return "new_equipment";
	}
	
	@RequestMapping(value = "/book_equipment", method = RequestMethod.POST)
	public String bookEquipment(@ModelAttribute("equipment") Equipment equipment) {
		
		//service.save(equipment);
		
        //return "redirect:/home";
		return "booking_success";
	}
	
	@RequestMapping("/book/{id}")
	public ModelAndView showBookEquipmentPage(@PathVariable(name = "id") int id) {
		
		ModelAndView mav = new ModelAndView("book_equipment");
		Equipment equipment = service.get(id);
		mav.addObject("equipment", equipment);
		
		return mav;
	}
}
