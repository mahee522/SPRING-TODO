package com.todo.service;

import java.sql.SQLException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.todo.model.TodoCategory;
import com.todo.model.TodoTask;
@Service
public class TodoServiceImpl implements TodoService{
	
	TodoService _todoservice;

	public void set_todoservice(TodoService _todoservice) {
		this._todoservice = _todoservice;
	}

	@Override
	@Transactional
	public void addCategory(TodoCategory _category) {
		this._todoservice.addCategory(_category);
		
	}

	@Override
	@Transactional
	public List<TodoCategory> listAllCategorys() {
		
		return this._todoservice.listAllCategorys();
	}

	@Override
	@Transactional
	public void deleteCategory(String _categoryI) {
		this._todoservice.deleteCategory(_categoryI);
		
	}

	@Override
	@Transactional
	public void deleteAllCategorys(TodoCategory deleteAllCategorys) {
		
		this._todoservice.deleteAllCategorys(deleteAllCategorys);
	}

	@Override
	@Transactional
	public void addTask(TodoTask addTask) {
		this._todoservice.addTask(addTask);
		
	}

	@Override
	@Transactional
	public void upDateTask(TodoTask updateTask) {
		this._todoservice.upDateTask(updateTask);
		
	}

	@Override
	@Transactional
	public void deleteTask(String _taskId) {
		this._todoservice.deleteTask(_taskId);
		
	}

	@Override
	@Transactional
	public List<TodoTask> listAllTasks(TodoTask listAllTasks){
		// TODO Auto-generated method stub
		return this._todoservice.listAllTasks(listAllTasks);
	}

	@Override
	@Transactional
	public void deleteAllTasks(TodoTask deleteAllTasks) {
		this._todoservice.deleteAllTasks(deleteAllTasks);
		
	}

}
