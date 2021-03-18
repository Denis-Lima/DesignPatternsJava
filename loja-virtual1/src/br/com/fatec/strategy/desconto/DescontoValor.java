package br.com.fatec.strategy.desconto;

import java.math.BigDecimal;

import br.com.fatec.strategy.Desconto;

public class DescontoValor implements Desconto {
	private BigDecimal valorDesconto;	
	
	public DescontoValor(BigDecimal bigDecimal) {
		this.valorDesconto = bigDecimal;
	}


	@Override
	public BigDecimal getValorDesconto(BigDecimal valorProduto) {
		return valorProduto.subtract(valorDesconto);
	}
}