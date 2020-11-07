package dkeep.cli;

import dkeep.logic.*;

import java.awt.Point;
import java.util.*;

public class Game {
	
private static int status=0;   

public int  getStatusGame() {
	return Game.status;	
}
private static Scanner scanner;
static String direction;

public int win_lose(String [][] map, Dragon dragon, Hero hero, AllAboutTheGame state){
 
	int X = hero.hX(map, hero.Status());
 	int Y = hero.hY(map, hero.Status()); 
 	
   // situa�ao pos-move
	if(map[Y-1][X] == " D" || map[Y+1][X] == " D" || map[Y][X-1] == " D" || map[Y][X+1] == " D" ||
	   map[Y-1][X] == " F" || map[Y+1][X] == " F" || map[Y][X-1] == " F" || map[Y][X+1] == " F"||
	   map[Y-1][X] == " d" || map[Y+1][X] == " d" || map[Y][X-1] == " d" || map[Y][X+1] == " d") {
		  System.out.println("inside win lose down");
		
		  if(map[Y][X]==" A") {
			  dragon.State(0);  // dragon dead
			  state.NumberOfDragonsDead();
			  System.out.println("inside win lose");
			  
			  if(map[Y-1][X] == " D" || map[Y-1][X] == " d") {
				  map[Y-1][X] = "  ";
				  return status = 3; 
			  	}
			  else if(map[Y+1][X] == " D" || map[Y+1][X] == " d") {
				  map[Y+1][X] = "  ";
				  return  status = 3; 
		  		}
			  else if(map[Y][X-1] == " D" || map[Y][X-1] == " d") {
				  map[Y][X-1] = "  ";
		  		  return  status = 3; 
	  			}
			  else if(map[Y][X+1] == " D" || map[Y][X+1] == " d") {
				  map[Y][X+1] = "  ";
	   			  return status = 3; 
					}
				}		
		  else if(map[Y][X]==" H") {
			  
			  if(map[Y-1][X] == " D" || map[Y-1][X] == " F") {
				  hero.State(0);  //hero dead
				  return status = -2; 
			  	}
			  else if(map[Y+1][X] == " D" || map[Y+1][X] == " F") {
				  hero.State(0);  //hero dead
				  return status = -2; 	
		  		}
			  else if(map[Y][X-1] == " D" || map[Y][X-1] == " F") {
				  hero.State(0);  //hero dead
				  return status = -2; 	
	  			}
			  else if(map[Y][X+1] == " D" || map[Y][X+1] == " F") {
				  hero.State(0);  //hero dead
				  return status = -2; 
						}
				  }
			  
		   }
	
 	return 0;
 
   }



public int armedHero(String [][] map , int Y, int X, Hero hero) {
	
	 int heroX = hero.hX(map, hero.Status());
	 int heroY = hero.hY(map, hero.Status()); 
	 
	
		if(map[Y-1][X] == " D" || map[Y-1][X] == " d") {
		   map[Y-1][X] = "  ";
		   map[heroY][heroX] = "  ";
		   map[Y][X] = " A";
		    return status = 3; 
	   	}

	   	else if(map[Y+1][X] == " D" || map[Y+1][X] == " d") {
	   		map[Y+1][X] = "  ";
	   		map[heroY][heroX] = "  ";
	   		map[Y][X] = " A";
	   		return status = 3; 
	   	}
 
	   	else if(map[Y][X-1] == " D" || map[Y][X-1] == " d") {
	   		map[Y][X-1] = "  ";
	   		map[heroY][heroX] = "  ";
	   		map[Y][X] = " A";
	   		return status = 3; 
	    }
	   	
	   	else if(map[Y][X+1] == " D" || map[Y][X+1] == " d") {
	   		map[Y][X+1] = "  ";
	   		map[heroY][heroX] = "  ";
	   		map[Y][X] = " A";
	   		return status = 3; 
		}
	
	return 0;
} 
public void killOrDie(String [][] map, int Y, int X, ArrayList<Dragon> dragon, AllAboutTheGame state, Hero hero ) {
	
	 int heroX = hero.hX(map, hero.Status());
	 int heroY = hero.hY(map, hero.Status());
	 
	
	 if(map[heroY][heroX]==" A") {
		 for(int i=0; i <dragon.size(); i++ ) {
			 if(dragon.get(i).getX()==X || dragon.get(i).getY()==Y) {
			   dragon.get(i).State(0);  // dragon dead
			   dragon.remove(i);  
			   state.NumberOfDragonsDead();
			   armedHero(map,Y, X, hero); 
			   break;
			 }
			 else {
				 System.out.println("dragon.get(i).getPositonX() " + dragon.get(i).getX());
			 	 System.out.println("dragon.get(i).getPositonY() " + dragon.get(i).getY());
			 }
			  
			  
		 }
	 	}		
	  
	 	else if(map[heroY][heroX]==" H") {
	 			map[heroY][heroX] = "  ";
	 			map[Y][X] = " H";
	 			hero.State(0);  //hero dead
	 			status = -2;
	 	}
		   
	}



public void killOrDieWithAsleepDragon(String [][] map, int Y, int X, ArrayList<Dragon> dragon, AllAboutTheGame state, Hero hero ) {
	
	 int heroX = hero.hX(map, hero.Status());
	 int heroY = hero.hY(map, hero.Status());
	 
	
	 
	 if(map[heroY][heroX]==" A") {
		 for(int i=0; i <dragon.size(); i++ ) {
			 if((dragon.get(i).getY()==(Y+1)) && (dragon.get(i).getX()==X)) {
				System.out.println("inside if");
			   dragon.get(i).State(0);  // dragon dead
			   dragon.remove(i);  
			   state.NumberOfDragonsDead();
			   armedHero(map,Y, X, hero); 
			   break;
			 }
			 else if((dragon.get(i).getY()==(Y-1)) && (dragon.get(i).getX()==X)) {
					System.out.println("inside if");
					   dragon.get(i).State(0);  // dragon dead
					   dragon.remove(i); 
					   state.NumberOfDragonsDead();
					   armedHero(map,Y, X, hero); 
					   break;
					 }
			 else if((dragon.get(i).getY()==Y) && (dragon.get(i).getX()==(X+1))) {
					System.out.println("inside if");
					   dragon.get(i).State(0);  // dragon dead
					   dragon.remove(i);  
					   state.NumberOfDragonsDead();
					   armedHero(map,Y, X, hero); 
					   break;
					 }
			 else if((dragon.get(i).getY()==Y) && (dragon.get(i).getX()==(X-1))) {
					System.out.println("inside if");
					   dragon.get(i).State(0);  // dragon dead
					   dragon.remove(i);  
					   state.NumberOfDragonsDead();
					   armedHero(map,Y, X, hero); 
					   break;
					 }
			 else {
				 System.out.println("dragon.get(i).getX() " + dragon.get(i).getX());
			 	 System.out.println("dragon.get(i).getY() " + dragon.get(i).getY());
			 }
			  
		 }
	 	}		
	  
	 	else if(map[heroY][heroX]==" H") {
	 			map[heroY][heroX] = "  ";
	 			map[Y][X] = " H";

	 	}
		   
	}

	public Point getDirection(String direction) {
		
		if(direction.equals("w")) {
			return new Point(0,-1);
		}
		
		else if(direction.equals("s")) {
			return new Point(0,1);
		}
		
		else if(direction.equals("a")) {
			return new Point(-1,0);
		}

		else if(direction.equals("d")) {
			return new Point(1,0);
		}

		return new Point(0,0);
	}
	
	public void getMove(String direction,  String[][] map, Hero hero, AllAboutTheGame state, ArrayList<Dragon> dragon, Sword sword) {   // 
	
		 int X = hero.hX(map, hero.Status());
		 int Y = hero.hY(map, hero.Status()); 
		 
		 int moveY=getDirection(direction).y;
		 int moveX=getDirection(direction).x;
		
		   if(map[Y+moveY][X+moveX] == " X" || map[Y+moveY][X+moveX] == " d") {  // if wall
			   status = -1;
			   //return map;  
		   }
		   
		   else if(map[Y+moveY][X+moveX] == " S") {  //  if hero find the sword
			   map[Y][X] = "  ";
			   map[Y+moveY][X+moveX]  = " A";
			   hero.State(2);
			   sword.updateState(0);
			   
			   
			  for(int i=0; i <dragon.size(); i++ ) {  // check when hero move 

				  if(win_lose(map,dragon.get(i),hero, state)!=0) {
					  if(status==3) 
						  dragon.remove(i);
				  // return map;  
				   }
			  }
				
			  for(int i=0; i <dragon.size(); i++ ) {  // check after each dragon move
				  map=dragon.get(i).moveDragon(map);
			   
				  if(win_lose(map,dragon.get(i),hero, state)!=0) {
					  if(status==3) 
						  dragon.remove(i);
					 /// return map;  //???????  if kill 2 dragons in the same position
				   }
			  } 
			status = 1;
		//	return map;  //  valid move
		   }
		   
		   else if(map[Y+moveY][X+moveX] == " E") {

			   if(state.getNumberOfDragons()==0 && sword.getState()==0) {
				   map[Y][X] = "  ";
				   map[Y+moveY][X+moveX] = " A";
				   status = 2;
				//   return map;
			   }
			   else {
				   //X--;
				   status = -3;
			   }
		   }  // possible bug happening here
		   else if(map[Y+moveY-1][X+moveX] == " D" || map[Y+moveY+1][X+moveX] == " D" || map[Y+moveY][X+moveX-1] == " D" || map[Y+moveY][X+moveX+1] == " D" ||
				   map[Y+moveY-1][X+moveX] == " F" || map[Y+moveY+1][X+moveX] == " F" || map[Y+moveY][X+moveX-1] == " F" || map[Y+moveY][X+moveX+1] == " F") {
			   killOrDie(map,Y+moveY,X+moveX, dragon, state, hero);
		   
		   }
		// possible bug happening here
		   else if( map[Y+moveY-1][X+moveX] == " d" || map[Y+moveY+1][X+moveX] == " d" ||  map[Y+moveY][X+moveX-1] == " d" || map[Y+moveY][X+moveX+1] == " d") {
			   killOrDieWithAsleepDragon(map,Y+moveY,X+moveX, dragon, state, hero );
		   }
		   
		   else {
				if(map[Y][X] == " A") {
					   map[Y][X] = "  ";
					   map[Y+moveY][X+moveX] = " A";
					   
					   for(int i=0; i <dragon.size(); i++ ) {  // check when hero moves 
						   if(win_lose(map,dragon.get(i),hero, state)!=0) {
							   
							   if(status==3) {
								   dragon.remove(i);
							   }
								   
							   //return map;
						   }
					   }
					   
					   for(int i=0; i <dragon.size(); i++ ) {   // check after each dragon moves
						   map=dragon.get(i).moveDragon(map);
						   
						   if(win_lose(map,dragon.get(i),hero, state)!=0) {
							   
							   if(status==3)
								   dragon.remove(i);
							   //return map;
						   }
					   }
					   status = 0;
					  // return map;  // going on
				   	}
				
				   else if(map[Y][X] == " H") {
					   map[Y][X] = "  ";
					   map[Y+moveY][X+moveX] = " H";
					   
					   for(int i=0; i <dragon.size(); i++ ) { 
						   if(win_lose(map,dragon.get(i),hero, state)!=0) {
							   
							   if(status==3)
								   dragon.remove(i);
					//		   return map;
						   }
					   }
					   for(int i=0; i <dragon.size(); i++ ) { 
						   map=dragon.get(i).moveDragon(map);

						   if(win_lose(map,dragon.get(i),hero, state)!=0) {
							   
							   if(status==3)
								   dragon.remove(i);
						//	   return map;
						   }
					   }
					   status = 0;
					  // return map;  // going on
				   }
		   
		   }	
	
	}
	

public static void main(String []args) {
    	  
	 scanner = new java.util.Scanner(System.in);
	   
	 System.out.println("Maze!");
	 System.out.println("Printing Map!");
	 System.out.println("Use a,w,s,d do move the hero");
	 System.out.println(" ");
  
  
	  Game handle = new  Game();
	  gameMap maze=new  gameMap();
	  AllAboutTheGame stateGame= new AllAboutTheGame();  

	  // cretate a dragon
  
	  Sword sword = new Sword();
	  sword.newElement(maze.drawMap()," S");
  
	  // create a dragon
	  //  new code
	  List<Dragon> dragoes = new ArrayList<Dragon>();
	  System.out.print("how many dragons do you want :  ");
	  String numberDragons=scanner.next();
	  
	  stateGame.numberOfDragons(Integer.parseInt(numberDragons));
  
	  for(int i=0; i<Integer.parseInt(numberDragons); i++) {
		  dragoes.add(new Dragon(i));
	  }
  
	  for(int i=0; i<Integer.parseInt(numberDragons); i++) {
		  Dragon CurrentDragon=dragoes.get(i);
		  CurrentDragon.newElement(maze.drawMap(), " D");
	  }
  
  
	  // create a hero
	  Hero hero = new Hero();
	  hero.newElement(maze.drawMap(), " H");
  
	  System.out.println("current situation"); 
	  //  print initial map of the game
	  maze.printMap(maze.drawMap());

	  while( stateGame.currentStateOfTheGame(status)!=-2 
		  &&  stateGame.currentStateOfTheGame(status)!=2 ) {
		  
		  System.out.print("Next move(a w s d) : ");
		  direction = scanner.next();  // ask for new position
		  //String [][]currentMap = 
		  handle.getMove(direction, maze.drawMap(), hero, stateGame, (ArrayList<Dragon>) dragoes, sword);
		  maze.printMap(maze.drawMap());;
	  	
	  	} 
	  }	
}