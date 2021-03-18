package br.com.fatec.desconto;

import java.math.BigDecimal;

public interface Desconto {
	public BigDecimal aplicarDesconto(BigDecimal valor);
}
