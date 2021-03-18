package br.com.fatec.produto;

import java.math.BigDecimal;

import br.com.fatec.strategy.Desconto;

public class Produto {
	protected String nome;
	protected BigDecimal valorProduto;
	protected Desconto descontoProduto;
	
	public Produto(String nome, BigDecimal valorProduto) {
		this.nome = nome;
		this.valorProduto = valorProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(BigDecimal valorProduto) {
		this.valorProduto = valorProduto;
	}

	public void setDesconto(Desconto desconto) {
		this.descontoProduto = desconto;
	}

	public Desconto getDesconto() {
		return descontoProduto;
	}
}
