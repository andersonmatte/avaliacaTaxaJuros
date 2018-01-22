package br.com.andersonmatte.avaliacaTaxaJuros.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Anderson Matte 
 * 
 * Classe que representa a CLIENTE do BD.
 * 
 */
@Entity
@Table(name="cliente")
public class Cliente {
	
	public Cliente() {	
	}
	
	public Cliente(Long id, String nomeCliente, Double limiteCredito, String risco, Long taxaJuros) {
		this.id = id;
		this.nomeCliente = nomeCliente;
		this.limiteCredito = limiteCredito;
		this.risco = risco;
		this.taxaJuros = taxaJuros;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="nome_cliente")
	private String nomeCliente;
	
	@Column(name="limite_credito")
	private Double limiteCredito;
	
	@Column(name="risco")
	private String risco;
	
	@Column(name="taxa_juros")
	private Long taxaJuros;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public String getRisco() {
		return risco;
	}

	public void setRisco(String risco) {
		this.risco = risco;
	}

	public Long getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Long taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

}