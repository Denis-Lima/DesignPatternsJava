package br.com.fatec;

import java.math.BigDecimal;
import java.util.ArrayList;

import br.com.fatec.calculador.CalculadorPreco;
import br.com.fatec.desconto.DescontoFixo;
import br.com.fatec.desconto.DescontoPorcentagem;
import br.com.fatec.produto.Produto;
import br.com.fatec.produto.ProdutoComposto;
import br.com.fatec.produto.ProdutoUnitario;

public class Principal {

	public static void main(String[] args) {
		String descricao = "Marca: Xiaomi\nModelo:Redmi note 8\nOrigem: China\nBateria: 5000ma";
		Produto p1 = new ProdutoUnitario("Redmi note 8", new BigDecimal("1400"), descricao, new DescontoFixo(new BigDecimal("230")));
		descricao = "Marca: Xiaomi\nModelo: Mi band 4\nOrigem: China\nPeso: 78g";
		Produto p2 = new ProdutoUnitario("Mi band 4", new BigDecimal("450.99"), descricao, new DescontoFixo(new BigDecimal("100")));
		descricao = "Marca: Xiaomi\nModelo: Mi stick TV\nOrigem: China\nCompatível com: ChromeCast";
		Produto p3 = new ProdutoUnitario("Mi stick TV", new BigDecimal("699.99"), descricao, new DescontoFixo(new BigDecimal("199.99")));
		CalculadorPreco c = new CalculadorPreco();
		
		//p1.calcularDescontoTotal();
		//p2.calcularDescontoTotal();
		//p3.calcularDescontoTotal();

		System.out.println(p1.getNome() + "\nPreço: R$" + c.calcularPrecoDesconto(p1) + "\nDescrição: " + p1.getDescricao());
		System.out.println("\n");
		System.out.println(p2.getNome() + "\nPreço: R$" + c.calcularPrecoDesconto(p2) + "\nDescrição: " + p2.getDescricao());
		System.out.println("\n");
		System.out.println(p3.getNome() + "\nPreço: R$" + c.calcularPrecoDesconto(p3) + "\nDescrição: " + p3.getDescricao());
		System.out.println("\n");
		
		ArrayList<Produto> prods = new ArrayList<>();
		
		ProdutoComposto kitXiaomi = new ProdutoComposto("Kit Xiaomi da semana Tech", prods);
		kitXiaomi.adicionarProduto(p1);
		kitXiaomi.adicionarProduto(p2);
		kitXiaomi.adicionarProduto(p3);
		kitXiaomi.calcularValorTotal();
		kitXiaomi.setDesconto(new DescontoPorcentagem(new BigDecimal("15")));
		//kitXiaomi.calcularDescontoTotal();
		
		System.out.println(kitXiaomi.getNome() + "\nPreço: R$" + c.calcularPrecoDesconto(kitXiaomi) + "\nDescrição: " + kitXiaomi.getDescricao());
	}

}
