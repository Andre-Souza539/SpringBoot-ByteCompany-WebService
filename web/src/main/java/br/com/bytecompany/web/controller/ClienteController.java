package br.com.bytecompany.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.bytecompany.web.model.Cliente;
import repository.ClienteRepository;

@Controller
public class ClienteController {

	@Autowired
	ClienteRepository clienteRep;
	
	
	@GetMapping ("/cliente")
	public String listar(Model md) {
		md.addAttribute("clientes", clienteRep.findAll());
		return "list";
	}
	
	@GetMapping("/add-cliente")
	public String addCliente(Model md) {
		md.addAttribute("Cliente", new Cliente());
		return "addClienteForm";
	}
	@PostMapping("/add-cliente")
	public String cadastraClienteBanco(@Valid Cliente cliente, BindingResult result) {
		if(result.hasErrors()) {
			return "addClienteForm";
		}
		clienteRep.save(cliente);
			return "redirect:/";
	}
	
}
