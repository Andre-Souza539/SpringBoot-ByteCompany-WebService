package br.com.bytecompany.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String homeApp(Model model) {
		model.addAttribute("mensagem", "Está mensagme foi injetada pelo Modelo");
		return "index";
	}
	
}
