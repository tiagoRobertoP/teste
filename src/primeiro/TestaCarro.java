package primeiro;

public class TestaCarro {

	public static void main(String[] args) {

		Proprietario proprietario = new Proprietario("Jonas", 123, 456);
		Carro carro = new Carro(proprietario);
		System.out.println("CPF: " + carro.getProprietario().getCpf());

		System.out.println(carro.exibeVolumeCombustivel());

		System.out.println("Velocidade: " + carro.getVelocidadeAtual() + "Km/h");
		carro.reduzAMarcha();
		System.out.println("Marcha : " + carro.getNumeroMarchas());
		carro.reduzAMarcha();
		System.out.println("Marcha : " + carro.getNumeroMarchas());
		carro.trocaMarcha();
		carro.trocaMarcha();
		carro.trocaMarcha();
		carro.trocaMarcha();
		carro.trocaMarcha();
		carro.trocaMarcha();
		carro.trocaMarcha();
		System.out.println(carro.getNumeroMarchas());
		
		Marca marca = new Marca();
		marca.setNomeMarca("Fiat");
		carro.setMarca(marca);
		System.out.println(carro.getMarca().getNomeMarca());
		
		Endereco endereco = new Endereco("Rua qualquer", "Bairro qualquer", "São Paulo", "SP", 123, "sem complemento");
		proprietario.setEndereco(endereco);
		System.out.println("Bairro do dono do carro : " + carro.getProprietario().getEndereco().getBairro());
	}

}
