package com.todo.service;

import java.util.List;

import com.todo.model.TodoCategory;
import com.todo.model.TodoTask;

public interface TodoService {
	
	public void addCategory(TodoCategory _category);
	
	public List<TodoCategory> listAllCategorys();
	
	public void deleteCategory(int id);
	
	public void deleteAllCategorys(int id);
	
	public void addTask(TodoTask addTask);
	
	public void upDateTask(int id);
	
	public void deleteTask(int id);
	
	public List<TodoTask> listAllTasks();
	
	public void deleteAllTasks(TodoTask deleteAllTasks);

}
