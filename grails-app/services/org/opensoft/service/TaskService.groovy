package org.opensoft.service
import org.opensoft.agilepm.domain.Task;

class TaskService{ 
	static expose = ['flex-remoting']
	boolean transactional = true
	
	def boolean createTask(Task task){
		task.save()
	}
	
	def Task getTaskById(int id){
		Task.get(id)
	}
	
	def List<Task> list(){
		Task.list();
	}
	
	def removeTask(int id){
		def task = Task.get(id)
		task.delete()
	}
	

}
