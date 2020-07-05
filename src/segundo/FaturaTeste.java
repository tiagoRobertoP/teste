package segundo;

public class FaturaTeste {

	public static void main(String[] args) {
		Fatura fatura = new  Fatura("1", "desc", 2, -1.0);
		
		System.out.println("Valor positivo: " + fatura.getTotalFatura(1, 2));
		System.out.println("Valor negativo: " + fatura.getTotalFatura(-1, 2));
		System.out.println("Preço negativo: " + fatura.getTotalFatura(1, -2));
		
	}
}
