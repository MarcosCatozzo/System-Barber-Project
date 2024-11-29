package com.projectdevs.barber.DTO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CadastroDeUsuarioDto(
		@NotBlank
		String nome,
		@NotBlank
		String sobreNome,
		@NotBlank
		@Email
		String email,
		@NotNull
		@Valid
		Endereco endereco

) {

}
