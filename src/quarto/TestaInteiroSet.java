package quarto;

public class TestaInteiroSet {
	public static void main(String[] args) {
		
		
		InteiroSet is = new InteiroSet();
		
		is.getInteiros().add(1);
		is.getInteiros().add(2);
		is.getInteiros().add(101);
		System.out.println("Inteiros: " +is.getInteiros());
		
		is.setA();
		System.out.println("Conjunto inicial: " +is.getA());
		
		System.out.println("União: " +is.union());
		System.out.println("Intersecção: " + is.intersection());
		
		is.insereElemento(1);
		System.out.println("Inserindo elemento: " + is.getA());
		
		is.deleteElemento(2);
		System.out.println("Deletando elemento: " + is.getA());
		
		System.out.println("String: " + is.toSetString());
		
		System.out.println(is.ehIgualTo());
		
		
	}

}
