import java.util.ArrayList;

public class Comboio {

	
	protected String type;
	
	protected int capacity=0;
	protected int numcars=0;
	
	
	private ArrayList <Carruagem> carruagem= new ArrayList<Carruagem>();

	public Comboio(String string) {
		this.type=string;
	}
	public String getNome() {
		
		return type;
	}
	public int getNumLugares() {
		for(Carruagem a : carruagem) {
			capacity+=a.getNumLugares();
		}
		return capacity;
	}
	public int getNumCarruagens() {
		// TODO Auto-generated method stub
		return carruagem.size();
	}
	public void addCarruagem(Carruagem a) {
		
		this.carruagem.add(a);
	}
	public Carruagem getCarruagemByOrder(int i) {
		return carruagem.get(i);
	}
	
	public void removeAllCarruagens(int x) {
		
		ArrayList <Carruagem> aux= new ArrayList<Carruagem>();
		
		
		 for (int i=0;i<x;i++) {
	         aux = (ArrayList<Carruagem>) carruagem.clone();
	    }s
	
	}
}