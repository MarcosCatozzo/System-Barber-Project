package com.projectdevs.barber.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CadastroDeUsuarioDto(
		@NotBlank
		String nome,
		@NotBlank
		String sobreNome,
		@NotBlank
		@Email
		String email,
		@NotBlank
		String logradouro,
		@NotBlank
		String bairro,
		@NotBlank
		String numero
) {

}
