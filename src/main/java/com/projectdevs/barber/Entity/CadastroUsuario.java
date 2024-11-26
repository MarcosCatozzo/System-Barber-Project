package com.projectdevs.barber.Entity;

import com.projectdevs.barber.DTO.CadastroDeUsuarioDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "barber")
@Table(name = "usuarios")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class CadastroUsuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "nome")
	private  String nome;

	@Column(name = "sobre_nome")
	private String sobreNome;

	@Column(name = "email")
	private String email;

	@Column(name = "logradouro")
	private String logradouro;

	@Column(name = "bairro")
	private String bairro;

	@Column(name = "numero")
	private String numero;

	public CadastroUsuario(CadastroDeUsuarioDto cadastroDeUsuarioDto){
		this.nome = cadastroDeUsuarioDto.nome();
		this.sobreNome = cadastroDeUsuarioDto.sobre_nome();
		this.email = cadastroDeUsuarioDto.email();
		this.logradouro = cadastroDeUsuarioDto.logradouro();
		this.bairro = cadastroDeUsuarioDto.bairro();
		this.numero = cadastroDeUsuarioDto.numero();
	}
}
