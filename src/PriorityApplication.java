
public class PriorityApplication {
	public static void main(String[] args) {
		Task taskA = new Task("Boot up", 10, Task.Status.COMPLETE);
		System.out.println(taskA.toString());
		
		Task taskB = new Task("Shut down", 8, Task.Status.NOT_STARTED);
		System.out.println(taskB.toString());
		
		System.out.println(taskA.compareTo(taskB));
		//System.out.println(taskB.compareTo(taskA));
		//System.out.println(taskA.compareTo(taskA));
		
		Process processA = new Process("Photoshop", 5);
		System.out.println(processA.toString());
		
		Process processB = new Process("InDesign", 10);
		System.out.println(processB.toString());
		
		System.out.println(processA.compareTo(processB));
		System.out.println(processB.compareTo(processA));
		
		taskB.setPriority(2);
		taskB.setStatus(Task.Status.IN_PROCESS);
		System.out.println(taskB.toString());
		
	}//end main
}//end class
