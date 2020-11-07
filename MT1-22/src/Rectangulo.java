
public class Rectangulo extends Figura {

	protected int x1,  y1,  x2,  y2;
	public Rectangulo(int x1, int y1, int x2, int y2) {
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
		
		this.perimetro = 2*Math.abs((y2-y1)) + 2*Math.abs((x2-x1));
		this.area = Math.abs((y2-y1)) * Math.abs((x2-x1));
				
	}

}
