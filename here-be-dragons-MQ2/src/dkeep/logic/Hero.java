package dkeep.logic;


import java.awt.Point;

public class Hero extends gameElement{

	private int Y;
	private int X;
	
	private String h= " H";
	private String h_armed = " A";
	
	private int hero=1;
	int state =1;

	public void State(int dead)
	{
		this.hero=dead;
	}
	
	public int Status()
	{
		return this.hero;
	}
	
	public String statusHero()
	{
		if(Status()==2)
		{
			return " A";
		}
		if(Status()==1)
		{
			return " H";
		}
		else 
			return "  ";
		
	}

	public int hX(String [][] map, int keyFlag)
	{
		if(keyFlag==2) {
			this.X=get_X( map, h_armed);
			return this.X;
		}
		else { 
			this.X=get_X( map, h);
			return this.X;
		}
	}

	public int hY(String [][] map, int keyFlag)
	{
		if(keyFlag==2) {
			this.X=get_X( map, h_armed);
			return this.Y;
		}
		else { 
			this.X=get_X( map, h);
			return this.Y;
		}
	}
}

