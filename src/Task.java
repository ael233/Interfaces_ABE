
public class Task implements Priority{

	public enum Status{
		NOT_STARTED,
		IN_PROCESS,
		COMPLETE
	}
	
	private String name;
	private int priority;
	private Status status;
	
	public Task() {
		name = "";
		priority = 0;
	}//end empty-argument constructor
	
	public Task(String name, int priority, Status status) {
		this.name = name;
		this.priority = priority;
		this.status = status;
	}//end preferred constructor

	public String getName() {
		return name;
	}//end getName

	public void setName(String name) {
		this.name = name;
	}//end setName
	
	public void setStatus(Status Status) {
		this.status = Status;
	}//end setStatus
	
	public Status getStatus() {
		return status;
	}//end getStatus

	@Override
	public void setPriority(int priority) { //IMPLEMENT THE INTERFACE!!!
		this.priority = priority;

	}//end setPriority

	@Override
	public int getPriority() {
		return priority;

	}//end getPriority
	
	public int compareTo(Task task2) {
		int task1Priority = getPriority();
		int task2Priority = task2.getPriority();
		if(task1Priority == task2.getPriority()) {
			return 0;
		}else if(task1Priority > task2Priority){
			return 1;
		}else {
			return -1;
		}
			
	}//end compareTo

	@Override
	public String toString() {
		return "Task [name=" + name + ", priority=" + priority + ", status=" + status + "]";
	}//end toString
	
	

}//end class