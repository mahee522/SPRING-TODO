package com.todo.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.todo.model.TodoCategory;
import com.todo.model.TodoTask;
import com.todo.service.TodoService;

@Controller
public class TodoController {
	
	private TodoService todoService;
	
	@Autowired(required=true)
	@Qualifier(value="personService")
	public void setTodoService(TodoService todoService) {
		this.todoService = todoService;
	}
	
	@RequestMapping(value="/todoCategorys", method=RequestMethod.GET)
	public String listAllCategorys(Model model) {
		model.addAttribute("category", new TodoCategory());
        model.addAttribute("listCategorys", this.todoService.listAllCategorys());
        return "todoCategory";
	}
	
	@RequestMapping(value="/todoCategory/add",method = RequestMethod.POST)
	public String addCategory(TodoCategory _category)
	{
		if(_category.getCategoryId()==0)
		{
			this.todoService.addCategory(_category);
		}
		return "redirect:todoCategorys";		
	}
	@RequestMapping(value="/todocategory/{id}")
	public String deleteCategory(@PathVariable("id") int id) {
		this.todoService.deleteCategory(id);
		return "redirect:todoCategorys";
	}
	
	@RequestMapping(value="/todocategory/{id}")
	public String deleteAllCategorys(@PathVariable("id") int id) {
		this.todoService.deleteAllCategorys(id);
		return "redirect:todoCategorys";
	}
	
	@RequestMapping(value="/todoTasks", method=RequestMethod.GET)
	public String listAllTasks(Model model)  {
		model.addAttribute("task", new TodoTask());
        model.addAttribute("listTasks", this.todoService.listAllTasks());
        return "todoTask";
	}
	
	@RequestMapping(value="/todoTasks", method=RequestMethod.POST)
	public String addTask(TodoTask addTask) {
		if(addTask.getTaskId()==0)
		{
			this.todoService.addTask(addTask);
		}
		return "redirect:todoTasks";	
	}
	
	@RequestMapping("/update/{id}")
	public String upDateTask(@PathVariable("id") int id, Model model) {
		model.addAttribute("todoTask");
        model.addAttribute("listPersons", this.todoService.listAllTasks());
        return "todoTask";
	}
	@RequestMapping(value="/todotask/{id}")
	public String deleteTask(@PathVariable("id") int id) {
		this.todoService.deleteTask(id);
		return "redirect:todoTasks";
	}
	
	
	@RequestMapping(value="/todotask/{id}")
	public String deleteAllTasks(@PathVariable("id") int id) {
		this.todoService.deleteTask(id);
		return "redirect:todoTasks";
	}
	
	}
