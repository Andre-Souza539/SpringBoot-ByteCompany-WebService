package br.com.bytecompany.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClienteController {

	@Autowired
	ClienteRepository clienteRepository;
	
	@RequestMapping("/")
	public String listaCliente(Model model) {
		model.addAttribute("clientes", clienteRepository.findAll());
		return "list";
		
	}
	
}
