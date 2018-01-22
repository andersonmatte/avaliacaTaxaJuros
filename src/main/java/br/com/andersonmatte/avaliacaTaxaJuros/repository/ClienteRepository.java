package br.com.andersonmatte.avaliacaTaxaJuros.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.andersonmatte.avaliacaTaxaJuros.entidade.Cliente;

/**
 * @author Anderson Matte 
 * 
 * Interface Cliente.
 * 
 */
public interface ClienteRepository extends CrudRepository<Cliente, String>{

}
