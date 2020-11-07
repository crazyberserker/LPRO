package dkeep.logic;

import java.util.Random;

public class Dragon extends gameElement{

	private int dragon=1;
	private int number;
	
	public	Dragon(int number)
	{
		this.number = number;
	}
	
	public int getDragonNumber() {
		return this.number;
	}
	
	public void State(int dead) {
		this.dragon=dead;
	}
	
	public int curState() {
		return this.dragon;
	}
	
	public int possibleMovement(String [][] map)
	{
		if(map[this.Y][this.X+1]=="  ")
			return 1;
		else if (map[this.Y][this.X-1]=="  ")
			return 1;
		else if(map[this.Y+1][this.X]=="  ")
			return 1;
		else if (map[this.Y-1][this.X]=="  ")
			return 1;
		else
			return 0;

	}
	

	 public String [][] moveDragon(String [][] map){
	     int dragonNotMove=1;
	    	 
	     if(this.dragon==1 && dragonNotMove==0){    	
	    	 Random randomGenerator = new Random();
	    
	    	 if(possibleMovement(map)==1 && ( map[this.Y][this.X]==" F")) {
	 
	    	 	while(true) {
	    	 
	    	 		int x_radom= 1 - randomGenerator.nextInt(3);
	    	 		int y_radom= 1 - randomGenerator.nextInt(3);
	    		 
	    	 		if( (x_radom==0 && y_radom!=0) || (x_radom!=0 && y_radom==0)) {
	    			
	    	 			if(map[this.Y+y_radom][this.X+x_radom]=="  ") {
	    	 				if(map[this.Y][this.X]==" D") {
	    	 					map[this.Y][this.X]="  ";
	    	 					map[this.Y+y_radom][this.X+x_radom]=" D";
	    	 					this.Y=this.Y+y_radom;
	    	 					this.X=this.X+x_radom;
	    	 					break;
	    	 					}
	    	 				else if(map[this.Y][this.X]==" F") {
	    	 					map[this.Y][this.X]=" S";
	    	 					map[this.Y+y_radom][this.X+x_radom]=" D";
	    	 					this.Y=this.Y+y_radom;
	    	 					this.X=this.X+x_radom;
	    	 					break;
	    		 				}
	    	 				else if(map[this.Y][this.X]==" d") {
	    	 					map[this.Y][this.X]="  ";
	    	 					map[this.Y+y_radom][this.X+x_radom]=" D";
	    	 					this.Y=this.Y+y_radom;
	    	 					this.X=this.X+x_radom;
	    	 					break;
	    		 				}
	    	 			}
	    		 	
	    	 			else if(map[this.Y+y_radom][this.X+x_radom]==" S") {
	    	 				map[this.Y][this.X]="  ";
	    	 				map[this.Y+y_radom][this.X+x_radom]=" F";
	    	 				this.Y=this.Y+y_radom;
	    	 				this.X=this.X+x_radom;
	    	 				break;
	    		 			}
	    	 		}
	    	 	}
	    	 }
	    	 else if (map[this.Y][this.X] !=" F")
	    		 map[this.Y][this.X]= " d";
	    		    	 
	    	 
	     }
	     return map;
	   }
}
