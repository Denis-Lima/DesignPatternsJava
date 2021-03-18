package br.com.fatec.calculo.caminhao;

import java.time.LocalDateTime;

import br.com.fatec.calculo.CalculoValor;

public class ValorCarga implements CalculoValor{
	
	private int eixos;
	private double carga;
	private double valorPorCarga, valorPorEixo;
	
	public ValorCarga (int eixos, double carga, double valorPorCarga, double valorPorEixo) {
		this.valorPorCarga = valorPorCarga;
		this.valorPorEixo = valorPorEixo;
		this.eixos = eixos;
		this.carga = carga;
	}

	@Override
	public double valorConta(LocalDateTime entrada, LocalDateTime saida) {
		return eixos * valorPorEixo + carga * valorPorCarga;
	}
}