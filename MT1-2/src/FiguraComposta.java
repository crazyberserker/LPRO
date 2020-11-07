
public class FiguraComposta extends Figura implements Countable{

	protected Figura[] figuras;
	
	public double total=0;
	
	public FiguraComposta(Figura[] figuras) {
		this.figuras=figuras;
	}
	
	public double getArea() {
		for(int i=0; i<figuras.length;i++){
			total+=figuras[i].getArea();
		}
		return total;
	}
	
	@Override
	public int count() {
		return figuras.length;
	}

}
