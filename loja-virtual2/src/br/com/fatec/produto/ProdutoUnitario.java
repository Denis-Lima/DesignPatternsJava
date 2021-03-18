package br.com.fatec.produto;

import java.math.BigDecimal;

import br.com.fatec.desconto.Desconto;

public class ProdutoUnitario extends Produto{

	public ProdutoUnitario(String nome, BigDecimal valorProduto, String descricao, Desconto desconto) {
		this.nome = nome;
		this.valorProduto = valorProduto;
		this.descricao = descricao;
		this.desconto = desconto;
	}
	
	@Override
	public void calcularDescontoTotal() {
		setDescontoTotal(desconto.aplicarDesconto(this.valorProduto));
	}

	@Override
	public void calcularValorTotal() {
		setValorProduto(this.valorProduto);
	}
}