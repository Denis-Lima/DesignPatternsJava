 package br.com.fatec.calculador;

import java.math.BigDecimal;

import br.com.fatec.produto.Produto;

public class CalculadorPreco {
	private Produto produto;

	public CalculadorPreco(Produto produto) {
		this.produto = produto;
	}
	
	public BigDecimal calcularDesconto() {
		return produto.getDesconto().getValorDesconto(this.produto.getValorProduto());
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}