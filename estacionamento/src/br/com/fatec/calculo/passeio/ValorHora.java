package br.com.fatec.calculo.passeio;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import br.com.fatec.calculo.CalculoValor;

public class ValorHora implements CalculoValor{
	
	private double valorHora;

	public ValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	@Override
	public double valorConta(LocalDateTime entrada, LocalDateTime saida) {
		double horas = ChronoUnit.HOURS.between(entrada, saida);
		return valorHora * horas;
	}
}