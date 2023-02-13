package eman.house;
import eman.person.Person;

public class House {
	private Door door;
	Person person = new Person() {};
	
	public House() {
		door = new Door();
	}
	
	public Door getDoor() {
		return this.door;
	}
	
	public class Door {
		private String doorStatus = "door is locked";
		public void doorStatus() {
			System.out.println(doorStatus);
		}
		
		public void setDoorStatus() {
			this.doorStatus = "door is open";
		}
	}

	
}

