package com.computadoras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.computadoras.model.Cliente;

public class ClienteController {

	
	@GetMapping(value = "/CrearCliente")
	public String createClienteForm(Model model) {
		Cliente cliente = new Cliente();
		model.addAttribute("cliente", cliente);
		return "cliente/CrearCliente";
	}
	/*
	@PostMapping(value = "/CrearCliente")
	public String createCliente(@Valid @ModelAttribute(name="cliente")) Cliente cliente,
			BindingResult result,
			RedirectAttributes redirectattributes{
		
	} */
}
