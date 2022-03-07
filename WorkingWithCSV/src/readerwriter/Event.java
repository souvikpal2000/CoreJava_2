package readerwriter;

public class Event {
	//fill your code here
	private String eventName;
	private int attendeesCount;
	private String ownerName;
	Event(String eventName, int attendeesCount, String ownerName){
		this.eventName = eventName;
		this.attendeesCount = attendeesCount;
		this.ownerName = ownerName;
	}
	public String getName(){
		return eventName;
	}
	public int getAttendeesCount(){
		return attendeesCount;
	}
	public String getOwnerName(){
		return ownerName;
	}
}
