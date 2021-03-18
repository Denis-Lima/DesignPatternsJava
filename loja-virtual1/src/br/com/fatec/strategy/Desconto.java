package br.com.fatec.strategy;

import java.math.BigDecimal;

public interface Desconto {
	public BigDecimal getValorDesconto(BigDecimal valorProduto);
}