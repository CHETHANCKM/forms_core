package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
	
	
	
	@GetMapping("/")
	public String indexPage(Model model)
	{
		model.addAttribute("index");
		return "index";
		
	}

}
