package dkeep.logic;

public class AllAboutTheGame {

	private int dalive=1;
	private int h=1; //hero=0  hero dead
	private int numberOfDragons=0;	
	private int status;

	public void numberOfDragons(int number) {
		this.numberOfDragons=number;
	}
	
	public int getNumberOfDragons() {
		return this.numberOfDragons;
	}
	
	public int NumberOfDragonsDead() {
		return this.numberOfDragons--;
	}
	
	public int getStatus()
	{
		return this.status;
	}
	
	
	public int currentStateOfTheGame(int status){
		
		  System.out.println("");
		  
		  if(status == 0); 
		  				
		  	else if(status == -1){
		  			System.out.println("Invalid move");
		  			return this.status=-1;
		  		}
		  			
		  		else if(status == 1) {
		  			System.out.println("You just found the your sword! Fight!!");
		  			this.h=2;
		  			return this.status=1;
		  			}
		  
		  			else if(status == -2) {
		  				System.out.println("Game over :(");
		  				this.h=0;
		  				return this.status=-2;
		  				}
		  
		  				else if(status == -3) {
		  					System.out.println("Kill the dragon before leave! ");
		  					}
		  				
		  					else if(status == 2) {
		  						System.out.println("Congratulations! You completed the mmaze :)");
		  						return this.status=2;
		  						}
		  						
		  						else if(status == 3) {
		  						System.out.println("Congratulations! You killed the dragon");
		  						this.dalive=0;
	  							return this.status=3;
		  							}
		  						
		  							else
		  								System.out.println("Carefull!! something went outside the range of the game");
		  								return this.status=0;
	 	}
	
	
	public static void main(String []args) {
		
		
	}
}
