package br.com.fatec.desconto;

import java.math.BigDecimal;

public class DescontoFixo implements Desconto {
	private BigDecimal valorDesconto;

	public DescontoFixo(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	@Override
	public BigDecimal aplicarDesconto(BigDecimal valor) {
		return valorDesconto;
	}

}