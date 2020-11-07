
public class Ponto {

	protected int x, y;
		
	public Ponto(int x, int y) {
		this.x=x;
		this.y=y;	
	
		
	}
	
	public int getX() {
		
		return this.x;
	}
	
	public int getY() {
		
		return this.y;
	}
	
	public String toString(){
		return "(" + this.x + ", " + this.y + ")";
	}
	
	public boolean equals(Object p1) {
		
		if(p1 instanceof Ponto) {
			Ponto p = (Ponto) p1;
			return p.x==x && p.y==y;
		}
		return false;
	}
	


}
