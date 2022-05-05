package com.generation.gamesxd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name= "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public Long id;
	
	@NotBlank
	public String nome;
	
	public String tipo_midia;
	
	@NotNull
	public int valor;
}
