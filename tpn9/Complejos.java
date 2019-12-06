package ejercicio1;

public class Complejos extends Numeros implements IParaNumeros {
	
	
	
	private double a;
	private double b;
	
	
	public Complejos (double a, double b) {
		this.a=a;
		this.b=b;
	}

	@Override
	public void sumar(Numeros nro) {
		// TODO Auto-generated method stub	
		
	}

	@Override
	public void restar(Numeros nro) {
		// TODO Auto-generated method stub
		
	}

	
	public double getValor() {
		
		return this.a;
	}
public double getValor2() {
		
		return this.b;
	}

	@Override
	public String toString() {
		return "Valor [a=" + a + ", b=" + b + "]";
	}

	@Override
	public void division(Numeros n1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiplicar(Numeros n1) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
