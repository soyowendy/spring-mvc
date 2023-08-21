package br.com.souowendy.springmvc.controller;

import br.com.souowendy.springmvc.repository.FreelancerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/freelancer")
public class FreelancerController {
	@Autowired
	private FreelancerRepository freelancerRepository;

	@GetMapping
	public ModelAndView showAll() {
		ModelAndView modelAndView = new ModelAndView("lista");
		modelAndView.addObject("freelancers", freelancerRepository.findAll());
		return modelAndView;
	}


}
