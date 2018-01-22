package br.com.andersonmatte.avaliacaTaxaJuros.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.andersonmatte.avaliacaTaxaJuros.entidade.Cliente;
import br.com.andersonmatte.avaliacaTaxaJuros.repository.ClienteRepository;

/**
 * @author Anderson Matte 
 * 
 * Classe service que contem as operacoes de CRUD.
 * 
 */
@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	/**
	 * Metodo que recupera todos os clientes armazenados no BD.
	 * 
	 * @return List<Cliente>;
	 */
	public List<Cliente> getRecuperarTodos() {
		List<Cliente> clientes = new ArrayList<>();
		this.clienteRepository.findAll().forEach(clientes::add);
		return clientes;
	}
	
	/**
	 * Metodo que insere um novo cliente.
	 * 
	 * @param Cliente cliente;
	 */
	public void inserirCliente(Cliente cliente) {
		this.clienteRepository.save(cliente);
	}
	
	/**
	 * Metodo que atualiza um cliente já cadastrado.
	 * 
	 * @param Cliente cliente;
	 * @param String id;
	 */
	public void atualizarCliente(Long id, Cliente cliente) {
		this.clienteRepository.save(cliente);
	}
	
	/**
	 * Metodo que exclui um cliente já cadastrado.
	 * 
	 * @param Cliente cliente;
	 */
	public void apagarCliente(Long id) {
		this.clienteRepository.delete(id.toString());
	}
	
}
