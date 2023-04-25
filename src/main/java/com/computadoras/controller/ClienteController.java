package com.computadoras.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.computadoras.interfaces.IClienteRepository;
import com.computadoras.model.Cliente;

@Controller
public class ClienteController {

	@Autowired
	private IClienteRepository repo;
	
	@GetMapping("/registrar")
	public String registroClientes(Model model) 
	{
		Cliente c = new Cliente();
		model.addAttribute("cliente",c);
		return "registro";
	}
	
	@PostMapping("/registrar")
	public String postRegistroClientes(Cliente cliente)
	{
		repo.save(cliente);
		return "listado";
	}
	
	@GetMapping("/listar")
	public String listadoClientes(Model model) {
		model.addAttribute("lstClientes", repo.findAll());
		return "listado";
	}
}
