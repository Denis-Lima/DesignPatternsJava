package br.com.fatec.produto;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ProdutoComposto extends Produto {
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

	public ProdutoComposto(String nomeKit, ArrayList<Produto> listaProdutos) {
		this.listaProdutos.addAll(listaProdutos);
		this.nome = nomeKit;
	}
	
	public void adicionarProduto(Produto p) {
		listaProdutos.add(p);
	}
	
	public void removerProduto(Produto p) {
		listaProdutos.remove(p);
	}

	@Override
	public void calcularValorTotal() {
		BigDecimal total = new BigDecimal("0.0");
		for (Produto produto : listaProdutos) {
			total = total.add(produto.getValorProduto());
		}
		setValorProduto(total);
	}
	
	@Override
	public void calcularDescontoTotal() {
		BigDecimal total = new BigDecimal("0.0");
		for (Produto prod : listaProdutos) {
			total = total.add(prod.getDesconto().aplicarDesconto(prod.getValorProduto()));
		}
		setDescontoTotal(total);
	}
}