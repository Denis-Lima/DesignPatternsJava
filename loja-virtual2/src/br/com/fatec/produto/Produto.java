package br.com.fatec.produto;

import java.math.BigDecimal;

import br.com.fatec.desconto.Desconto;

public abstract class Produto {
	protected String nome;
	protected BigDecimal valorProduto;
	protected String descricao;
	protected Desconto desconto;
	protected BigDecimal descontoTotal;
	
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Desconto getDesconto() {
		return desconto;
	}

	public void setDesconto(Desconto desconto) {
		this.desconto = desconto;
	}
	
	public BigDecimal calcularDesconto() {
		return desconto.aplicarDesconto(valorProduto);
	}
	
	public BigDecimal getDescontoTotal() {
		return descontoTotal;
	}

	public void setDescontoTotal(BigDecimal descontoTotal) {
		this.descontoTotal = descontoTotal;
	}
	
	public abstract void calcularDescontoTotal();
	
	public abstract void calcularValorTotal();
}