package taskManagement;

import java.util.ArrayList;
import java.util.List;


public class TaskList extends Task {

private List<Task> task;
	
	public TaskList() {
		this.task = new ArrayList<>();
	}

	@Override
	public void display() {
		System.out.print("[");
		for(Task t : task) {
			t.display();
		}
		System.out.print("]");
	}
		
		public void add(Task task){
			this.task.add(task);
		}
}
