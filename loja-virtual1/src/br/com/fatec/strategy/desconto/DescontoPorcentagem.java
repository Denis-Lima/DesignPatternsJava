package br.com.fatec.strategy.desconto;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.fatec.strategy.Desconto;

public class DescontoPorcentagem implements Desconto{
	private BigDecimal porcentagem;
	
	public DescontoPorcentagem(BigDecimal porcentagem) {
		this.porcentagem = porcentagem;
	}

	@Override
	public BigDecimal getValorDesconto(BigDecimal valorProduto) {
		BigDecimal desc = valorProduto.multiply(porcentagem);
		desc = desc.divide(new BigDecimal("100"), 2, RoundingMode.DOWN);
		return valorProduto.subtract(desc);
	}
}