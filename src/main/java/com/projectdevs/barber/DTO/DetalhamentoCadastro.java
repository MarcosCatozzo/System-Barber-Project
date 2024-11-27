package com.projectdevs.barber.DTO;

import com.projectdevs.barber.Entity.CadastroUsuario;

public record DetalhamentoCadastro(
		Long id,
		String nome,
		String sobreNome,
		String email,
		String logradouro,
		String bairro,
		String numero
) {
	public DetalhamentoCadastro(CadastroUsuario cadastroUsuario){
		this(
				cadastroUsuario.getId(),
				cadastroUsuario.getNome(),
				cadastroUsuario.getSobreNome(),
				cadastroUsuario.getEmail(),
				cadastroUsuario.getLogradouro(),
				cadastroUsuario.getBairro(),
				cadastroUsuario.getNumero()
		);
	}
}
