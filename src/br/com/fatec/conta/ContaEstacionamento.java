package br.com.fatec.conta;

import java.time.LocalDateTime;

import br.com.fatec.calculo.CalculoValor;
import br.com.fatec.veiculo.Veiculo;

public class ContaEstacionamento {

	// inicio e fim em LocalDateTime
	private LocalDateTime inicio;
	private LocalDateTime fim;
	private Veiculo veiculo;
	private CalculoValor calculo;
	
	public ContaEstacionamento(LocalDateTime inicio, LocalDateTime fim, Veiculo veiculo) {
		this.inicio = inicio;
		this.fim = fim;
		this.veiculo = veiculo;
	}

	public double valorConta() {
		return calculo.valorConta(inicio, fim);
	}
	
	public LocalDateTime getInicio() {
		return inicio;
	}

	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}

	public LocalDateTime getFim() {
		return fim;
	}

	public void setFim(LocalDateTime fim) {
		this.fim = fim;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public CalculoValor getCalculo() {
		return calculo;
	}
	
	public void setCalculo(CalculoValor calc) {
		this.calculo = calc;
	}
}