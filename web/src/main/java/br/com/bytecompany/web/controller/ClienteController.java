package br.com.bytecompany.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bytecompany.web.model.Cliente;
import repository.ClienteRepository;

@Controller
public class ClienteController {

	@Autowired
	ClienteRepository clienteRepository;
	
	
	@RequestMapping ("/cliente")
	public String listar(Model md) {
		md.addAttribute("clientes", clienteRepository.findAll());
		return "list";
	}
	
	@GetMapping("/add-cliente")
	public String addCliente(Model md) {
		md.addAttribute("Cliente", new Cliente());
		return "cliente-form";
	}
	@PostMapping("/add-cliente")
	public String cadastraClienteBanco(@Valid Cliente cliente, BindingResult result) {
		if(result.hasErrors()) {
			return "addClienteForm";
		}
		clienteRepository.save(cliente);
			return "redirect:/";
	}
	
}
