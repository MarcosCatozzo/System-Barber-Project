package com.projectdevs.barber.DTO;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Endereco {
		private String logradouro;
		private String bairro;
		private String numero;
		private String cep;

		public Endereco(DadosEndereco dadosEndereco){
			this.logradouro = dadosEndereco.logradouro();
			this.bairro = dadosEndereco.bairro();
			this.numero = dadosEndereco.numero();
			this.cep = dadosEndereco.cep();
		}

		public void atualizaEndereco(Endereco endereco){
			if (endereco.logradouro != null){
				this.logradouro = endereco.logradouro;
			}
			if (endereco.bairro != null){
				this.bairro = endereco.bairro;
			}
			if (endereco.numero != null){
				this.numero = endereco.numero;
			}
			if (endereco.cep != null){
				this.cep = endereco.cep;
			}
		}
}
