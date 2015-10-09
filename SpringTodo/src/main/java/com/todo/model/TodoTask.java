package com.todo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TodoTask")
public class TodoTask {


	int taskId;
	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int string) {
		this.taskId = string;
	}
	
	String categoryName;
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	String isTaskCompleted;
	public String getIsTaskCompleted() {
		return isTaskCompleted;
	}

	public void setIsTaskCompleted(String isTaskCompleted) {
		this.isTaskCompleted = isTaskCompleted;
	}
	
	String categoryId;
	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	String task;
	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}
	Date taskCompletionDate;
	public Date getTaskCompletionDate() {
		return taskCompletionDate;
	}

	public void setTaskCompletionDate(Date taskCompletionDate) {
		this.taskCompletionDate = taskCompletionDate;
	}
}
