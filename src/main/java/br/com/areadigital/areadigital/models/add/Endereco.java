package br.com.areadigital.areadigital.models.add;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
@NoArgsConstructor
public class Endereco {

	@Column(length = 80)
	private String rua;

	@Column(length = 10)
	private String numero;

	@Column(length = 80)
	private String bairro;

	@Column(length = 10)
	private String cep;

}
