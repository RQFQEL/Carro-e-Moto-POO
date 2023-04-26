package veiculos;

public class Carro {

	private String modelo;

	private String marca;

	private boolean ligado;

	private float velocidade;

	private int qtdPortas;

	public Carro(String modelo, String marca, boolean ligado, float velocidade, int qtdPortas) {
		this.modelo = modelo;
		this.marca = marca;
		this.ligado = ligado;
		this.velocidade = velocidade;
		this.qtdPortas = qtdPortas;

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}

	public void acelerar() {
		this.velocidade += 5;
	}

	public void brecar() {
		this.velocidade -= 10;

		if (this.velocidade < 0) {
			this.velocidade = 0;
		}

	}

	public void ligar() {
		this.ligado = true;

	}
	
	public void desligar() {
		this.ligado = false;
	}

	public void imprime() {
		System.out.println("Modelo: " + modelo + "\nMarca: " + marca + "\nO carro esta ligado?: " + ligado + "\nKm/h: " + velocidade + "\nQuantidade de portas: " + qtdPortas);
	}

}
