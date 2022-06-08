package br.com.bytecompany.web;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotNull
	@Size(min = 3)
	private String nome;
	@NotNull
	@Size(min = 3)
	private String endereco;
	@NotNull
	@Size(min = 11)
	private String cpf;
	
}
