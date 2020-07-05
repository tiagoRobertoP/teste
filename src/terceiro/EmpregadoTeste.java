package terceiro;

public class EmpregadoTeste {

	public static void main(String[] args) {
		
		Empregado empregado1 = new Empregado("Jonas", "Goethe", 1000);
		Empregado empregado2 = new Empregado("Amadeus", "Silva", 2000);
		
		System.out.println("O salário de " + empregado1.getNome() + " é de " + empregado1.getSalarioMensal());
		System.out.println("O salário de " + empregado2.getNome() + " é de " + empregado2.getSalarioMensal());
		
		
		empregado1.setSalarioMensal(empregado1.getSalarioMensal()*1.1);
		empregado2.setSalarioMensal(empregado2.getSalarioMensal()*1.1);
		System.out.println("O salário de " + empregado1.getNome() + "com aumento de 10% é de " + empregado1.getSalarioMensal());
		System.out.println("O salário de " + empregado2.getNome() + "com aumento de 10% é de " + empregado2.getSalarioMensal());
		
		System.out.println("Número de empregados que passaram pela empresa: " + Empregado.getNumeroDeEmpregados());
	}
}
