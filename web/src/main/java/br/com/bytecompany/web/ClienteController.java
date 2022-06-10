package br.com.bytecompany.web;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.hibernate.annotations.Parameter;
import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClienteController {

	@Autowired
	ClienteRepository clienteRepository;
	
	@RequestMapping("/clientes")
	public String listaCliente(Model model) {
		model.addAttribute("clientes", clienteRepository.findAll());
		return "listarClientes";
		
	}
	
	@GetMapping("/add")
	public String clienteForm(Model model) {
		model.addAttribute("cliente", new Cliente());
		return "clienteForm";
	}
	
	@PostMapping("/process")
	public String processForm(@Valid Cliente cliente, BindingResult result) {
		if(result.hasErrors()) {
			return "clienteForm";
		}
		clienteRepository.save(cliente);
		return "redirect:/clientes";
	}
	
	@GetMapping("/cliente/delete/{id}")
	public String deleteCliente(@PathVariable Long id) {
		clienteRepository.deleteById(id);
		return "redirect:/clientes";
	}
	
	@GetMapping("/cliente/edit/{id}")
	public String editCliente(@PathVariable Long id, Model model) {
			
		
		return "UpdateForm";
	}
	
}
