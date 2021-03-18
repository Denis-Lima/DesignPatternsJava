package br.com.fatec.calculador;

import java.math.BigDecimal;

import br.com.fatec.produto.Produto;

public class CalculadorPreco {

	public BigDecimal calcularPrecoDesconto(Produto p) {
		p.calcularValorTotal();
		p.calcularDescontoTotal();
		BigDecimal total = p.getValorProduto();
		BigDecimal descTotal = p.getDescontoTotal();
		System.out.println("Preço total: R$" + total);
		System.out.println("Desconto total: R$" + descTotal);
		return total.subtract(descTotal);
	}
}