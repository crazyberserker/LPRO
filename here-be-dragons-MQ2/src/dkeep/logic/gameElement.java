package dkeep.logic;

import java.awt.Point;
import java.util.Random;

public class gameElement {
		
		protected int X;
		protected int Y;
		
		int [] positions = null;
	
	
		public int getX() {
			return this.X;
		}
		public int getY() {
			return this.Y;
		}
		
		
		public void updateCoords(String [][] map, String object, Point position)
		{
			this.X=position.x;
			this.Y=position.y;
			
			if(map[this.Y][this.X] != " X")
		  		if(map[this.Y][this.X] != " S")
		  			if(map[this.Y][this.X] != " E")			 
		  				if(map[this.Y][this.X] != " H")
		  					if(map[this.Y-1][this.X] != " D")	 
		  						if(map[this.Y+1][this.X] != " D")
		  							if(map[this.Y][this.X+1] != " D")
		  								if(map[this.Y][this.X-1] != " D")
		  									if(map[this.Y][this.X] != " D") 
		  										map[this.Y][this.X]=object;
		  									else
		  										System.out.println("Error update coordinates");
				
			
		}

		
		public Point getCoord() {
			return new Point(this.X, this.Y);
		}
		
		
		public String [][] newElement(String [][] map, String element)
		{
			Random randomGenerator = new Random();
			
			while(true)
			{
				int X = randomGenerator.nextInt(9);
				int Y = randomGenerator.nextInt(9);
				
				if(map[Y][X] != " X")     
	    	  		if(map[Y][X] != " S")  		
	    	  			if(map[Y][X] != " E")	
	    	  				if(map[Y][X] != " H")  
	    	  					if(map[Y-1][X] != " D")	
	    	  						if(map[Y+1][X] != " D")
	    	  							if(map[Y][X+1] != " D")
	    	  								if(map[Y][X-1] != " D")
	    	  									if(map[Y][X] != " D") {
	    	  										map[Y][X]=element;
	    	  										this.X=X;
	    	  										this.Y=Y;
	    	  										break;
	    	  										}
			}
			return map;
		}
		
		public int get_X(String [][] map, String gameElement)
		{
			for(int i=0; i<map.length;i++)
			{
				for(int j=0; j < map.length; j++)
				{
					if(gameElement.equals(map[i][j]))
					{
						this.X=j;
						break;
					}
				}
			}
			
			if(this.X <0)
				System.out.println("Erro on X" + this.X);
			
			return this.X;
		}	
		
		public int get_Y(String [][] map, String gameElement)
		{
			for(int i=0; i<map.length;i++)
			{
				for(int j=0; j < map.length; j++)
				{
					if(gameElement.equals(map[i][j]))
					{
						this.Y=i;
						break;
					}
				}
			}
			
			if(this.Y <0)
				System.out.println("Erro on Y" + this.Y);
			
			return this.Y;
			
		}
		
		 public void updatePosition(int X, int Y) {
			 this.X=X;
			 this.Y=Y;
	   }
		 
		 public void currentPosition(String[][] map, String element) {
				
			   for (int y = 0; y < map.length; y++) {
				   for(int x= 0; x < map.length; x++) { 
					  	if(map[y][x].equals(element)) {
					  		  this.X=y;
					  		  this.Y=x;
					  		 break;
					  	}
				   }
			   }
	   }
}
