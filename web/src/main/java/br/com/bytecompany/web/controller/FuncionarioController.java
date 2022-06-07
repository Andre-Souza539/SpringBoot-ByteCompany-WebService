package br.com.bytecompany.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FuncionarioController {
	
	@GetMapping("/funcionarios")
	public String FuncionarioList(Model model) {
		model.addAttribute("mensagem", "Listagem de Funcionarios");
		return "funcionarios";
		
	}
}
