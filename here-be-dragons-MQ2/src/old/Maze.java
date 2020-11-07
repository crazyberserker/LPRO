package old;
import java.util.Random;
import java.util.Scanner;


public class Maze {

	
		public static String [][] map;
			private static Scanner scanner;
		int keyFlag;
	    int openDoor=0;
		
		int coordX;
		int coordY;
		
		int hX;
		int hY;
		
		public  static String [][] drawMap() {
			 String[][] map = { 
					   {" X", " X", " X", " X", " X", " X", " X", " X", " X", " X",} ,
					   {" X", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", " X",} ,
					   {" X", "  ", " X", " X", "  ", " X", "  ", " X", "  ", " X",} ,
					   {" X", "  ", " X", " X", "  ", " X", "  ", " X", "  ", " X",} ,
					   {" X", "  ", " X", " X", "  ", " X", "  ", " X", "  ", " X",} ,
					   {" X", "  ", "  ", "  ", "  ", "  ", "  ", " X", "  ", " E",} ,
					   {" X", "  ", " X", " X", "  ", " X", "  ", " X", "  ", " X",} ,
					   {" X", "  ", " X", " X", "  ", " X", "  ", " X", "  ", " X",} , 
					   {" X", "  ", " X", " X", "  ", "  ", "  ", "  ", "  ", " X",} ,
					   {" X", " X", " X", " X", " X", " X", " X", " X", " X", " X",} , };

			 return map;
		}
	
		public static void printMap(String [][] map) {

			   for (int i = 0; i < map.length; i++) {

				   for(int k= 0; k < map.length; k++)
					  		System.out.print(map[i][k]);

				   System.out.println("");

			   }

		}
		
		
		public void createHero()
		{
			Random randomGenerator = new Random();
			while(true)
			{
				hX = randomGenerator.nextInt(9);
				hY = randomGenerator.nextInt(9);
				
				if(map[hY][hX] != " X")
					if(map[hY][hX] != " E") 
						break;
			}
			map[hY][hX] = " H";
		}
		
		
		public void createDragon()
		{
			Random randomGenerator = new Random();
			
			while(true)
			{
				coordX = randomGenerator.nextInt(9);
				coordY = randomGenerator.nextInt(9);
				
				if(map[coordY][coordX] != " X")
					if(map[coordY][coordX] != " E")
						if(map[coordY+1][coordX] != " E")
							if(map[coordY-1][coordX] != " E")
								if(map[coordY][coordX+1] != " E")
									if(map[coordY][coordX-1] != " E")
										if(map[coordY+1][coordX] != " H")
											if(map[coordY-1][coordX] != " H")
												if(map[coordY][coordX+1] != " H")
													if(map[coordY][coordX-1] != " H")
															if(map[coordY][coordX] != " H")
																break;
								
			}
			
			map[coordY][coordX] = " D";
			
		}
		
		
		public void createKey()
		{
			Random randomGenerator = new Random();
					
			while(true)
			{
				coordX = randomGenerator.nextInt(9);
				coordY = randomGenerator.nextInt(9);
			
				if(map[coordY][coordX] != " X")
					if(map[coordY][coordX] != " E")
						if(map[coordY+1][coordX] != " D")
							if(map[coordY-1][coordX] != " D")
								if(map[coordY][coordX+1] != " D")
									if(map[coordY][coordX-1] != " D")
											if(map[coordY][coordX] != " D")
												if(map[coordY][coordX] != " H")
													break;
			}
			
			map[coordY][coordX] = " K";
		}
		
		
		public int getMove(String move)
		{
			if(move.equals("w"))
			{
				hY--;
				if(map[hY][hX] == " H"){
					hY++;
					return -1;
				}
			
				else if(map[hY][hX] == " K"){
					map[hY+1][hX] = "  ";
					map[hY][hX]= " H";
					printMap();
					return 1;
				}
				else if(map[hY-1][hX] == " D" || map[hY+1][hX] == " D" || map[hY][hX+1] == " D" || map[hY][hX-1] == " D"){
					map[hY+1][hX] = " ";
					map[hY][hX] = " H";
					printMap();
					return -2;
				}
				else if(map[hY][hX] == " E") {
			   	
				   if(keyFlag == 1) {
					  
					   map[hY][hX] = " H";
					   map[hY+1][hX] = " E";
					   printMap();
					   return 2;
				   }
				   else {
					   hY++;
					   return -3;  
				   }
				}
				else if(map[hY][hX] == " E") {
				
				   if(keyFlag == 1) {
					   
					   
					   map[hY+1][hX] = "  ";
					   map[hY][hX] = " H";
					   printMap();
					   return 2;
				   }
				   else {
					   hY++;
					   return -3;  
				   }
				}
			   
				else {
				   map[hY+1][hX] = "  ";
				   map[hY][hX] = " H";
				   printMap();
				   return 0;
			  	}	   
			}
			else if( move.equals("s")) {
				   hY++;			   
				   if(map[hY][hX] == " X") {
					   hY--;
					   return -1;
				   }   
				   else if(map[hY][hX] == " K") {
					   map[hY-1][hX] = "  ";
					   map[hY][hX] = " H";
					   printMap();
					   return 1;
				   }  
				   
				   else if(map[hY-1][hX] == " D" || map[hY+1][hX] == " D" || map[hY][hX-1] == " D" || map[hY][hX+1] == " D") {
					   map[hY-1][hX] = "  ";
					   map[hY][hX] = " H";
					   printMap();
					   return -2;	   
				   }
				   
				   else if(map[hY][hX] == " E") {
					   	
					   if(keyFlag == 1) {
						   map[hY-1][hX] = "  ";
						   map[hY][hX] = " H";
						   printMap();
						   return 2;
					   }
					   else {
						   hY--;
						   return -3;  
					   }
				   }
				   else {
					   map[hY-1][hX] = "  ";
					   map[hY][hX] = " H";
					   printMap();
					   return 0;
				   }
			   }
			   
			else if( move.equals("a")) {
				   hX--;
				   if(map[hY][hX] == " X") {
					   hX++;
					   return -1;
				   }
				   else if(map[hY][hX] == " K") {
					   map[hY][hX+1] = "  ";
					   map[hY][hX] = " H";
					   printMap();
					   return 1;
				   }
				   else if(map[hY-1][hX] == " D" || map[hY+1][hX] == " D" || map[hY][hX-1] == " D" || map[hY][hX+1] == " D") {
					   map[hY][hX+1] = "  ";
					   map[hY][hX] = " H";
					   printMap();
					   return -2;	   
				   }
				   else if(map[hY][hX] == " E") {
					   	
					   if(keyFlag == 1) {
						   map[hY][hX+1] = "  ";
						   map[hY][hX] = " H";
						   printMap();
						   return 4;
					   }
					   else {
						   hX--;
						   return -3;  
					   }
				   }
				   else {
					   map[hY][hX+1] = "  ";
					   map[hY][hX] = " H";
					   printMap();
					   return 0;
				   }
			   }
			   
			else if( move.equals("d")){
				   hX++;
				   if(map[hY][hX] == " X") {
					   hX--;
					   return -1;
				   }
				   
				   else if(map[hY][hX] == " K") {
					   map[hY][hX-1] = "  ";
					   map[hY][hX] = " H";
					   printMap();
					   return 1;
				   }
				   else if(map[hY][hX] == " E") {
					   	
					   if(keyFlag == 1) {
						   map[hY][hX-1] = " H";
						   map[hY][hX] = "  ";
						   hX--;
						   printMap();
						   openDoor=1;
						   return 2;
					   }
					   else {
						   hX--;
						   return -3;  
					   }
					   
				   }
				   else if(map[hY][hX] == "  " && openDoor==1) {
					   	
						   map[hY][hX-1] = "  ";
						   map[hY][hX] = " H";
						   printMap();
						   return 4;
					   
				   }
				   
				   else if(map[hY-1][hX] == " D" || map[hY+1][hX] == " D" || map[hY][hX-1] == " D" || map[hY][hX+1] == " D") {
					   map[hY][hX-1] = "  ";
					   map[hY][hX] = " H";
					   printMap();
					   return -2;	   
				   }

				   else {
					   map[hY][hX-1] = "  ";
					   map[hY][hX] = " H";
					   printMap();
					   return 0;
				   }
			   }
	
			return 0;
	
}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			 Maze game = new  Maze();
			 
			 Maze.map=drawMap();
			 game.createHero();
			 game.createDragon();
			 game.createKey();
			 Maze.printMap();
			 
			 int value;
			 game.keyFlag=0;
			 
			 System.out.println("Maze!");
			 System.out.println("Printing Map!");
			 System.out.println("Use a,w,s,d do move the hero");
			 System.out.println(" ");
			 
			 while(true) {
				 
				 scanner = new java.util.Scanner(System.in);
				 String move = scanner.next();
			
				 System.out.println(" ");
				 
				 value = game.getMove(move);
				 
				 if(value == 0);
				 
				 else if(value == -1)
					 System.out.println("Try again, that move is not valid!");
				 
				 else if(value == 1){
					 game.keyFlag = 1;
					 System.out.println("You got the Key! Go to the exit!");
				 }
				 else if(value == -2)
				 {
					 System.out.println("Game Over!");
					 break;
				 }
				 else if(value == -3)
				 {
					 System.out.println("You don't have the Key!");
				 }
				 else if(value == 2)
				 {
					 System.out.println("Door is open! Let's win this game!");
				 }
				 else if(value == 4)
				 {
					 System.out.println("You won!");
					 break;
				 }
			 }

		}

}
