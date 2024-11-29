package com.projectdevs.barber.DTO;

import jakarta.validation.constraints.NotNull;

public record AtualizaCadastro(
		@NotNull
		Long id,
		String email,
		Endereco endereco
){}
