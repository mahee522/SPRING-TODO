package com.todo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TodoCategory")
public class TodoCategory {
	
	@Id
	@Column(name="categoryId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	int categoryId;
	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int _categoryId) {
		this.categoryId = _categoryId;
	}
	String userId;
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	String category;
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	String categoryDesc;
	public String getCategoryDesc() {
		return categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}
	@Override
	public String toString()
	{
		return "categoryId "+categoryId+" UserID "+userId+" Category "+category+" Category desc"+categoryDesc;
	}
}
