package com.projectdevs.barber.Entity;

import com.projectdevs.barber.DTO.AtualizaCadastro;
import com.projectdevs.barber.DTO.CadastroDeUsuarioDto;
import com.projectdevs.barber.DTO.Endereco;
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

	@Embedded
	private Endereco endereco;

	public CadastroUsuario(CadastroDeUsuarioDto cadastroDeUsuarioDto){
		this.nome = cadastroDeUsuarioDto.nome();
		this.sobreNome = cadastroDeUsuarioDto.sobreNome();
		this.email = cadastroDeUsuarioDto.email();
		this.endereco = cadastroDeUsuarioDto.endereco();

	}

	public void atualizaCadastro(AtualizaCadastro atualizaCadastro){
		if (atualizaCadastro.email() != null){
			this.email = atualizaCadastro.email();
		}

		if (atualizaCadastro.endereco() != null){
			this.endereco.atualizaEndereco(atualizaCadastro.endereco());
		}
	}
}
