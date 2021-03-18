package br.com.fatec.veiculo;

public class VeiculoCarga extends Veiculo{
	private int eixos;
	private double carga;

	public VeiculoCarga(String modelo, String placa, int ano, int eixos, double carga) {
		super(modelo, placa, ano);
		this.eixos = eixos;
		this.carga = carga;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}
}