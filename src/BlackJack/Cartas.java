package BlackJack;

public class Cartas {
	
	
	private char tipo;
	private char valor;
	
	
	
	public char getValor(char v) {
		return this.valor;
	}
	
	public char getTipo(char t) {
		return this.tipo;
	}
	
	public void setValor(char v) {
		this.valor = v;
	}
	
	public void setTipo(char t) {
		this.valor = t;
	}
	
	
	public int getResult() {
		
		if (this.valor == 'T') return 10;
		else if (this.valor == 'J') return 10;
		else if (this.valor == 'Q') return 10;
		else if (this.valor == 'K') return 10;
		else if (this.valor == 'A') return 1;
		else return Integer.parseInt(this.valor+"");
	}
	
	
	public String toString() {

		return this.valor+""+this.tipo;

	}
	
	
	
	

}
