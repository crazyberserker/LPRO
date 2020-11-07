
public class Circulo extends Figura{

	protected int raio;
	protected Ponto centro;
	
	public Circulo(Ponto p, int i) {
		if(i<0)
			throw new IllegalArgumentException();
		
		this.raio=i;
		this.centro=p;
		
		this.area= Math.PI * raio*raio;
	}

	public int getRaio() {
		return raio;
	}

	public Ponto getCentro() {
		return centro;
	}

}
