package com.projectdevs.barber.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Range;

public record DadosEndereco(
		@NotBlank
		String logradouro,
		@NotBlank
		String bairro,
		@NotBlank
		String numero,
		@NotBlank
		@Pattern(regexp = "\\d{8}")
		String cep
) {
}
