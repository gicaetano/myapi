package br.com.xlcode.myapi.domain;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = -2382484970073234829L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message = "Campo NOME é mandatório")
	@Length(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres")
	private String nome;
	
	@NotEmpty(message = "Campo LOGIN é mandatório")
	@Length(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres")
	private String login;
	
	@NotEmpty(message = "Campo SENHA é mandatório")
	@Length(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres")
	private String senha;
	
	

}
