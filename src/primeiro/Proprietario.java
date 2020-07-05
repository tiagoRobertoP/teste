package primeiro;

import java.util.Calendar;

public class Proprietario {

	private String nome;
	private int cpf;
	private int rg;
	private Calendar dataDeNascimento;
	public Endereco endereco;
	
	public Proprietario(String nome, int cpf, int rg) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public Calendar getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Calendar dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	
	
	
}
