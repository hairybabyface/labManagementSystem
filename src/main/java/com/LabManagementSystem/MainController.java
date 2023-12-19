package com.LabManagementSystem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.LabManagementSystem.Bookings.Bookings;
import com.LabManagementSystem.Bookings.BookingsService;
import com.LabManagementSystem.Equipment.Equipment;
import com.LabManagementSystem.Equipment.EquipmentService;
import com.LabManagementSystem.Requests.Requests;
import com.LabManagementSystem.Requests.RequestsService;
import com.LabManagementSystem.User.User;
import com.LabManagementSystem.User.UserService;

@Controller
public class MainController {

    @Autowired
	private UserService userService;
	
	@Autowired
	private EquipmentService equipmentService; 

	@Autowired
	private BookingsService bookingsService;

	@Autowired
	private RequestsService requestsService;

    @GetMapping("/index")
    public String getIndexPage(){
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
    public String getRegisterPage(Model model){

		User user = new User();
		model.addAttribute("user", user);

        return "register";
    } 

	@RequestMapping(value = "/register_user", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user) {
		
		userService.save(user);
		
		return "register_success";
	}

    @GetMapping("/register_success")
    public String showRegisterSuccessPage(){
        
		return "register_success";
    } 

	@GetMapping("/register_failure")
    public String showRegisterFailurePage(){
        
		return "register_failure";
    } 

    @RequestMapping("/home")
	public String viewHomePage(Model model) {
		List<Equipment> listEquipment = equipmentService.listAll();
		model.addAttribute("listEquipment", listEquipment);
		
		return "home";
	}
	
	@RequestMapping("/book")
	public String showBookEquipmentPage(Model model) {
		Bookings booking = new Bookings();
		model.addAttribute("booking", booking);
		
		return "new_booking";
	}
	
	@RequestMapping(value = "/book_equipment", method = RequestMethod.POST)
	public String bookEquipment(@ModelAttribute("booking") Bookings booking) {
		
		bookingsService.save(booking);
		
		return "booking_success";
	}

	@RequestMapping("/view_bookings")
	public String viewBookingsPage(Model model) {
		List<Bookings> listBookings = bookingsService.listAll();
		model.addAttribute("listBookings", listBookings);
		
		return "view_bookings";
	}

	@RequestMapping("/request_equipment")
	public String showRequestEquipmentPage(Model model) {
		
		Requests request = new Requests();
		model.addAttribute("request", request);
		
		return "request_equipment";
	}

	@GetMapping("/back")
    public String goBack(){
        
		return "redirect:/home";
    } 

	@GetMapping("/booking_failure")
    public String showBookingFailurePage(){
        
		return "booking_failure";
    } 

	@GetMapping("/logout")
    public String showLogoutPage(){
        
		// System.exit(0);

		return "logout";
    } 
}
