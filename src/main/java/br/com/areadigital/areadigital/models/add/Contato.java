package br.com.areadigital.areadigital.models.add;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
@NoArgsConstructor
public class Contato   {

	@Column(length = 15)
	private String telefone;

	private String CPNJCPF;

}
