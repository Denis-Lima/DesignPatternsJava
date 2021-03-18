package br.com.fatec.calculo.passeio;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import br.com.fatec.calculo.CalculoValor;

public class ValorMensal implements CalculoValor{
		
	private double valorMes;

	public ValorMensal(double valorMes) {
		this.valorMes = valorMes;
	}

	@Override
	public double valorConta(LocalDateTime entrada, LocalDateTime saida) {
		double meses = ChronoUnit.MONTHS.between(entrada, saida);
		return valorMes * meses;
	}
}