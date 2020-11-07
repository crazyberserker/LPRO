import java.util.HashMap;

public class Building extends Facility{

	public String name;
	public int minFloor;
	public int maxFloor;

	
	HashMap<String,Room> rooms = new HashMap<String, Room>();
	
	public Building(String name, int minFloor, int maxFloor) {
		
		
		this.name=name;
		this.minFloor=minFloor;
		this.maxFloor=maxFloor;

		if(maxFloor < minFloor)
				throw new IllegalArgumentException();

	}
	
	public void addRoom(Room r) throws DuplicateRoomException {
		if(rooms.containsKey(r.getNumber())) {
			throw new DuplicateRoomException();
		}
		else {
			rooms.put(r.getNumber(), r);
		}
		
	}

	public String getName() {
		return name;
	}

	public int getMinFloor() {
		return minFloor;
	}

	public int getMaxFloor() {
		return maxFloor;
	}
	
	public String toString() {
		return "Building(" + name + ")";
	}

	public int getCapacity() {
		int cap=0;
		for(Room r : rooms.values()) {
			cap += r.getCapacity();
		}
		
		return cap;
	}

}
