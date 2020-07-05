package quarto;

import java.util.ArrayList;
import java.util.List;

public class InteiroSet {

	List<Integer> inteiros = new ArrayList<>();
	List<Boolean> a = new ArrayList<Boolean>();
	
	
	public void setA() {
		for (Integer x : inteiros){
			if (x <= 100) {
				a.add(true);
			}else {
				a.add(false);
			}
		}
	}
	
	public List <Boolean> union() {
		List<Boolean> u  = new ArrayList<Boolean>();
		for( int x=0; x < inteiros.size(); x++) {
				if (inteiros.get(x) <= 100 || a.get(x) == true) {
					u.add(true);
					continue;
				}else {
					u.add(false);
					continue;
				}
		}
		return u;
	}
	
	public List <Boolean> intersection() {
		List<Boolean> u  = new ArrayList<Boolean>();
		int intTrue= 0;
		int intFalse = 0;
		for( int x=0; x < inteiros.size(); x++) {
			if (inteiros.get(x) <= 100 && a.get(x) == true) {
				if (intTrue==0) {
					u.add(true);
					intTrue++;
				}
			}else {
				if (intFalse==0) {
					u.add(false);
					intFalse++;
				}
			}
		}
		return u;
	}
	
	public List <Boolean> insereElemento(int k){
		a.add(k, true);
		return a;
	}
	
	public List <Boolean> deleteElemento(int m){
		a.remove(m);
		return a;
	}
	
	public String toSetString() {
		String s = "";
		for (int x = 0; x < a.size(); x++) {
			if (a.get(x) == true) {
				s = s + "true ";
			}else {
				s = s + "false ";
			}
		}
		return s;
	}
	
	public String ehIgualTo() {
		if (inteiros.equals(a)) {
			return "São iguais";
		}else {
			return "Não são iguais";
		}
	}
	
	public List<Integer> getInteiros() {
		return inteiros;
	}
	public void setInteiros(List<Integer> inteiros) {
		this.inteiros = inteiros;
	}
	public List<Boolean> getA() {
		return a;
	}
	
			
}
