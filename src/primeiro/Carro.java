package primeiro;

public class Carro {
	private String modelo;
	private String cor;
	private int ano;
	private int chassi;
	private Proprietario proprietario;
	public Marca marca;
	private int velocidadeMaxima;
	private int velocidadeAtual;
	private int numeroPortas;
	private boolean temSolar;
	private int numeroMarchas = 0;
	private boolean TemAutomatico;
	private int volumeCombustivel;
	
	public Carro(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	
	
	public void acelera () {
		if (this.velocidadeAtual < 160) {
			this.velocidadeAtual =+1;
		}
	}
	
	public void freia () {
		this.velocidadeAtual = 0;
	}
	
	public void trocaMarcha() {
		if (this.numeroMarchas < 5) {
			this.numeroMarchas = this.numeroMarchas + 1;
		}
	}
	
	public void reduzAMarcha() {
		if (this.numeroMarchas >= 0 ){
			this.numeroMarchas = this.numeroMarchas - 1;
		}else if (this.numeroMarchas == 0 && this.velocidadeAtual == 0 ) {
			this.numeroMarchas = this.numeroMarchas - 1;
			}
		}
		
	
	public double autonomia (double consumoMedio) {
		return consumoMedio * volumeCombustivel;
	}

	public String exibeVolumeCombustivel () {
			return "Volume de combustível : " + this.volumeCombustivel;
	}
	
	
	
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getChassi() {
		return chassi;
	}
	public void setChassi(int chassi) {
		this.chassi = chassi;
	}
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public int getNumeroPortas() {
		return numeroPortas;
	}
	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	public boolean isTemSolar() {
		return temSolar;
	}
	public void setTemSolar(boolean temSolar) {
		this.temSolar = temSolar;
	}
	public int getNumeroMarchas() {
		return numeroMarchas;
	}
	public void setNumeroMarchas(int numeroMarchas) {
		this.numeroMarchas = numeroMarchas;
	}
	public boolean isTemAutomatico() {
		return TemAutomatico;
	}
	public void setTemAutomatico(boolean temAutomatico) {
		TemAutomatico = temAutomatico;
	}
	public int getVolumeCombustivel() {
		return volumeCombustivel;
	}
	public void setVolumeCombustivel(int volumeCombustivel) {
		this.volumeCombustivel = volumeCombustivel;
	}

}
