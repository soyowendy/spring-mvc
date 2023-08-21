package br.com.souowendy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
	@GetMapping("/hellonome")
	public String helloNome(ModelMap modelMap) {
		modelMap.addAttribute("nome", "Wenderson");
		return "home";
	}

	@GetMapping("/helloapelido")
	public ModelAndView helloApelido() {
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("nome", "Wendy");
		return modelAndView;
	}
}
