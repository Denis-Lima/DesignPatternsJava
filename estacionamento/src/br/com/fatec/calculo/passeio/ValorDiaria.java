package br.com.fatec.calculo.passeio;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import br.com.fatec.calculo.CalculoValor;

public class ValorDiaria implements CalculoValor{
	
	private double valorDiaria;

	public ValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	@Override
	public double valorConta(LocalDateTime entrada, LocalDateTime saida) {
		double dias = ChronoUnit.DAYS.between(entrada, saida);
		return valorDiaria * dias;
	}
}