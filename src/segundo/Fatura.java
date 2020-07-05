package segundo;

public class Fatura {
	
	private String numero;
	private String descricao;
	private int quantidade;
	private double preco;
	
	
	
	public Fatura(String numero, String descricao, int quantidade, double preco) {
		super();
		this.numero = numero;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	
	public Number getTotalFatura(int quantidade, double preco) {
		this.quantidade = quantidade;
		this.preco = preco;
		double valor = quantidade * preco;
		if (valor < 0) {
			if (preco < 0) {
				return 0.0;
			}
			return (int)0;
		}else {
			return valor;
		}
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
