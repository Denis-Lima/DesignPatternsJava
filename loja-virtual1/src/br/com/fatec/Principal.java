package br.com.fatec;

import java.math.BigDecimal;

import br.com.fatec.calculador.CalculadorPreco;
import br.com.fatec.produto.Produto;
import br.com.fatec.strategy.desconto.DescontoPorcentagem;
import br.com.fatec.strategy.desconto.DescontoValor;

/**
 * 
 * @author Denis Lima
 *
 */

public class Principal {
	public static void main(String[] args) {
		
		// Simulando um desconto com valor fixo de 200 reais
		Produto p = new Produto("PlayStation 5", new BigDecimal("5000"));
		p.setDesconto(new DescontoValor(new BigDecimal("200")));
		CalculadorPreco calculo = new CalculadorPreco(p);
		
		BigDecimal precoOriginal = p.getValorProduto();
		BigDecimal precoPromocao = calculo.calcularDesconto();
		
		System.out.println("Preço: R$" + precoOriginal);
		System.out.println("Com desconto o produto sai por: R$" + precoPromocao);
		System.out.println("Desconto total sobre o produto: R$" + (precoOriginal.subtract(precoPromocao)) + "\n");
		
		
		// Simulando um desconto com valor por porcentagem de 12%
		p.setValorProduto(new BigDecimal("4999.99"));
		p.setDesconto(new DescontoPorcentagem(new BigDecimal("12")));
		
		precoOriginal = p.getValorProduto();
		precoPromocao = calculo.calcularDesconto();
		
		System.out.println("Preço: R$" + precoOriginal);
		System.out.println("Com desconto o produto sai por: R$" + precoPromocao);
		System.out.println("Desconto total sobre o produto: R$" + (precoOriginal.subtract(precoPromocao)));
	}
}
