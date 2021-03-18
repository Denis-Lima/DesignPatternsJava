package br.com.fatec.desconto;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DescontoPorcentagem implements Desconto{
	private BigDecimal porcentagem;

	public DescontoPorcentagem(BigDecimal porcentagem) {
		this.porcentagem = porcentagem;
	}

	@Override
	public BigDecimal aplicarDesconto(BigDecimal valor) {
		BigDecimal desc = valor.multiply(porcentagem);
		desc = desc.divide(new BigDecimal("100"), 2, RoundingMode.DOWN);
		return desc;
	}
}