package br.com.souowendy.springmvc.controller;

import br.com.souowendy.springmvc.dto.FreelancerForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

	@GetMapping("/form")
	public ModelAndView freelancerForm() {
		ModelAndView modelAndView = new ModelAndView("form");
		modelAndView.addObject("form", new FreelancerForm());
		return modelAndView;
	}

	@PostMapping("/form")
	public String freelancerFormRecv(FreelancerForm form) {
		System.out.println(form);
		return "redirect:/form";
	}
}
