
public class Circulo extends Figura{

	protected Ponto centro;
	protected int raio;
	
	public Circulo(Ponto p, int raio) {
		
		if(raio<0)
			throw new IllegalArgumentException();
		
		this.centro=p;
		this.raio=raio;	
		
		 this.area=Math.PI * raio *raio;
		
	}

	public int getRaio() {
		return raio;
	}
	
	public Ponto getCentro() {
		return centro;
	}

}
