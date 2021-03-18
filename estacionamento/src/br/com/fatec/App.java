package br.com.fatec;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import br.com.fatec.calculo.CalculoValor;
import br.com.fatec.calculo.caminhao.ValorCarga;
import br.com.fatec.calculo.passeio.ValorDiaria;
import br.com.fatec.calculo.passeio.ValorHora;
import br.com.fatec.calculo.passeio.ValorMensal;
import br.com.fatec.conta.ContaEstacionamento;
import br.com.fatec.veiculo.Veiculo;
import br.com.fatec.veiculo.VeiculoCarga;
import br.com.fatec.veiculo.VeiculoPasseio;

/**
 * @author Denis Lima
 *
 */

public class App {

	public static void main(String[] args) {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		// Valores para exemplo
		Veiculo v = new VeiculoPasseio("Peugeot 208", "ABC1234", 2020);
		
		// simulando 6 horas de estacionamento
		LocalDateTime inicio = LocalDateTime.now();
		LocalDateTime fim = inicio.plus(6, ChronoUnit.HOURS);
		
		ContaEstacionamento conta = new ContaEstacionamento(inicio, fim, v);
		
		CalculoValor calc = new ValorHora(2);
		
		conta.setCalculo(calc);
		
		double valorTotal = conta.valorConta();
		System.out.println("Entrada: " + inicio.format(formato));
		System.out.println("Saída: " + fim.format(formato));
		System.out.println("O valor total da conta é de: R$" + String.valueOf(valorTotal).replace(".", ","));
		System.out.println("-------------------------------------------------");
		
		
		// Simulando para 10 dias
		LocalDateTime fim2 = inicio.plus(10, ChronoUnit.DAYS);
		
		ContaEstacionamento conta2 = new ContaEstacionamento(inicio, fim2, v);
		
		CalculoValor calc2 = new ValorDiaria(26);
		
		conta2.setCalculo(calc2);
		
		double valorTotal2 = conta2.valorConta();
		System.out.println("Entrada: " + inicio.format(formato));
		System.out.println("Saída: " + fim.format(formato));
		System.out.println("O valor total da conta é de: R$" + String.valueOf(valorTotal2).replace(".", ","));
		System.out.println("-------------------------------------------------");
		
		
		// Simulando para 3 meses
		LocalDateTime fim3 = inicio.plus(3, ChronoUnit.MONTHS);
		
		ContaEstacionamento conta3 = new ContaEstacionamento(inicio, fim3, v);
		
		CalculoValor calc3 = new ValorMensal(300);
		
		conta3.setCalculo(calc3);
		
		double valorTotal3 = conta3.valorConta();
		System.out.println("Entrada: " + inicio.format(formato));
		System.out.println("Saída: " + fim.format(formato));
		System.out.println("O valor total da conta é de: R$" + String.valueOf(valorTotal3).replace(".", ","));
		System.out.println("-------------------------------------------------");
		
		
		// Simulando para caminhões
		LocalDateTime fim4 = inicio.plus(3, ChronoUnit.HOURS);
		
		Veiculo caminhao = new VeiculoCarga("Carreta", "000AAAA", 2020, 3, 33.2);
		
		ContaEstacionamento conta4 = new ContaEstacionamento(inicio, fim4, caminhao);
		VeiculoCarga cam = (VeiculoCarga) conta4.getVeiculo();
		
		//									  n eixos,		n carga,     valorEixo, valorCarga
		CalculoValor calc4 = new ValorCarga(cam.getEixos(), cam.getCarga(), 50.0, 250.0);
		
		conta4.setCalculo(calc4);
		
		double valorTotal4 = conta4.valorConta();
		System.out.println("Entrada: " + inicio.format(formato));
		System.out.println("Saída: " + fim.format(formato));
		System.out.println("O valor total da conta é de: R$" + String.valueOf(valorTotal4).replace(".", ","));
		System.out.println("-------------------------------------------------");
	}

}
