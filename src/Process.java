
public class Process implements Priority{

	private String processID;
	private int priority;
	
	public Process() {
		processID = "";
		priority = 0;
	}//end empty-argument constructor
	
	public Process(String process, int priority) {
		processID = process;
		this.priority = priority;
	}//end preferred constructor
	
	@Override
	public void setPriority(int priority) {
		this.priority = priority;
	}//end setPriority

	@Override
	public int getPriority() {
		return priority;
	}//end getPriority
	
	public String getProcessID() {
		return processID;
	}//end getProcessID
	
	public int compareTo(Process process2) {
		int process1Priority = getPriority();
		int process2Priority = process2.getPriority();
		if(process1Priority == process2.getPriority()) {
			return 0;
		}else if(process1Priority > process2Priority){
			return 1;
		}else {
			return -1;
		}
		
	}//end compareTo

	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}//end toString
	
}//end class
