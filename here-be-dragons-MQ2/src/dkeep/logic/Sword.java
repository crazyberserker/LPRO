package dkeep.logic;

public class Sword extends gameElement{

	

		private int state=1;
		
		public void  updateState(int state) {
			 this.state=state;
		}
		
		public int getState() {
			return this.state;
			
		}
		

}
