package terceiro;

public class Empregado {
	
	private String nome;
	private String sobreNome;
	private double salarioMensal;
	public static int numeroDeEmpregados = 0;

	public Empregado(String nome, String sobreNome, double salarioMensal) {
		numeroDeEmpregados++;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.salarioMensal = salarioMensal;
	}
	
	public static int getNumeroDeEmpregados() {
		return numeroDeEmpregados;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public double getSalarioMensal() {
		return salarioMensal;
	}
	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

}
