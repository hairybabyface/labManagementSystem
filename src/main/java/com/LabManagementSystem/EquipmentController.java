package com.LabManagementSystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EquipmentController {

	@Autowired
	private EquipmentService service; 
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Equipment> listProducts = service.listAll();
		model.addAttribute("listProducts", listProducts);
		
		return "index";
	}
	
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
		Equipment product = new Equipment();
		model.addAttribute("product", product);
		
		return "new_equipment";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Equipment product) {
		service.save(product);
		
		//return "redirect:/";
		return "home";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
		
		ModelAndView mav = new ModelAndView("edit_equipment");
		Equipment product = service.get(id);
		mav.addObject("product", product);
		
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/";		
	}
}
