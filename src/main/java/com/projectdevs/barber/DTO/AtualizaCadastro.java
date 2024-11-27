package com.projectdevs.barber.DTO;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

public record AtualizaCadastro(
		@NotNull
		Long id,
		String email,
		String logradouro,
		String bairro,
		String numero
){}
