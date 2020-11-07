
public class Room extends Facility {
	
	Building b;
	String name;
	int floor;
	int capacity =0;
	
	public Room(Building b, String string, int i) throws DuplicateRoomException {
	
		
		if(i > b.getMaxFloor() || i < b.minFloor)
			throw new IllegalArgumentException();
			
			
		this.b=b;
		this.name=string;
		this.floor=i;

		b.addRoom(this);
	}

	public Room(Building b, String string, int i, int j) throws DuplicateRoomException {
		
		this(b,string,i);
		this.capacity=j;
		
	}


	public Building getBuilding() {
		
		return b;
	}


	public String getNumber() {
		return name;
	}


	public String getName() {
		return b.getName() + name;
	}


	public int getFloor() {
		return floor;
	}
	
	public String toString() {
		return "Room(" + b.getName() + "," +name + ")";
	}

	public int getCapacity() {
		return capacity;
	}

	public void authorize(User u1) {
		
	}

}
