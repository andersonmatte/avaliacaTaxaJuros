package br.com.andersonmatte.avaliacaTaxaJuros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.andersonmatte.avaliacaTaxaJuros.entidade.Cliente;
import br.com.andersonmatte.avaliacaTaxaJuros.service.ClienteService;

@RestController
@RequestMapping("/avaliacaTaxaJuros")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(value = "/clientes", method = RequestMethod.GET)
	public List<Cliente> getRecuperarTodos() {
		return this.clienteService.getRecuperarTodos();
	}
	
	@RequestMapping(value = "/clientes", method = RequestMethod.POST)
	public void inserirCliente(@RequestBody Cliente cliente) {
		if (cliente != null) {
			/* Definição da taxa de juros conforme o risco do cliente. */
			if (cliente.getRisco() != null) {
				if (cliente.getRisco().equals("a")) {
					cliente.setTaxaJuros(0l);
				} else if (cliente.getRisco().equals("b")) {
					cliente.setTaxaJuros(10l);
				} else if (cliente.getRisco().equals("c")) {
					cliente.setTaxaJuros(20l);
				}
			}
			this.clienteService.inserirCliente(cliente);
		} else {			
			return;
		}
	}
	
	@RequestMapping(value = "/clientes/{id}", method = RequestMethod.PUT)
	public void atualizarCliente(@RequestBody Cliente cliente,@PathVariable String id) {
		this.clienteService.atualizarCliente(id != null ? Long.parseLong(id) : null, cliente);
	}
	
	@RequestMapping(value = "/clientes/{id}", method = RequestMethod.DELETE)
	public void apagarCliente(@PathVariable String id) {
		this.clienteService.apagarCliente(id != null ? Long.parseLong(id) : null);
	}
	
}
