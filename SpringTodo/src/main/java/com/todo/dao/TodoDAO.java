package com.todo.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.todo.model.TodoCategory;
import com.todo.model.TodoTask;

public interface TodoDAO {
	public void addCategory(TodoCategory _category);
	
	public List<TodoCategory> listAllCategorys();
	
	public void deleteCategory(String _categoryI);
	
	public void deleteAllCategorys(TodoCategory deleteAllCategorys);
	
	public void addTask(TodoTask addTask);
	
	public void upDateTask(TodoTask updateTask);
	
	public void deleteTask(String _taskId);
	
	public List<TodoTask> listAllTasks();
	
	public void deleteAllTasks(TodoTask deleteAllTasks);
}
