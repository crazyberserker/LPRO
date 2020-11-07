
public class Ponto {

	protected int x;
	protected int y;
	
	public Ponto(int i, int j) {
		this.x=i;
		this.y=j;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public boolean equals(Object o)	{
		if(o instanceof Ponto)
		{
			Ponto v = (Ponto)o;
			return ( x==v.getX() && y==getY()); 
		}
		
		return false;
	}

}
