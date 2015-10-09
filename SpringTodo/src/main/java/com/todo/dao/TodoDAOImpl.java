package com.todo.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.todo.model.TodoCategory;
import com.todo.model.TodoTask;


@Repository
public class TodoDAOImpl implements TodoDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(TodoDAOImpl.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	@Override
	public void addCategory(TodoCategory _category) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(_category);
		logger.info("category saved successfully, category Details = " + _category);
	}

	@Override
	public List<TodoCategory> listAllCategorys() {
		Session session=this.sessionFactory.getCurrentSession();
		
		@SuppressWarnings("unchecked")
		List<TodoCategory> _categoryList=session.createQuery("from TodoCategory").list();
		for(TodoCategory tc : _categoryList){
			logger.info("Player List::"+tc);
		}
		return _categoryList;
	}

	@Override
	public void deleteCategory(String _categoryId) {
		
		Session session = this.sessionFactory.getCurrentSession();
		TodoCategory _toCategory=(TodoCategory)session.load(TodoCategory.class, _categoryId);
		if(null != _toCategory){
			session.delete(_toCategory);
		}
		logger.info("Category deleted successfully, category details = " + _toCategory);
		
	}

	@Override
	public void deleteAllCategorys(TodoCategory deleteAllCategorys) {
		Session session = this.sessionFactory.getCurrentSession();
			String _userId=deleteAllCategorys.getUserId();
		TodoCategory _toCategory=(TodoCategory) session.load(TodoCategory.class,_userId);
		if(null != _toCategory){
			session.delete(_toCategory);
		}
		logger.info("Category deleted successfully, category details = " + _toCategory);
		
		
	}

	@Override
	public void addTask(TodoTask addTask) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(addTask);
		logger.info("category saved successfully, category Details = " + addTask);
	}

	@Override
	public void upDateTask(TodoTask updateTask) {
		Session session=this.sessionFactory.getCurrentSession();
		session.persist(updateTask);
		logger.info("Todotask updated successfully, task Details="+updateTask);
		
	}

	@Override
	public void deleteTask(String _taskId) {

		Session session = this.sessionFactory.getCurrentSession();
		TodoCategory _todoCategory=(TodoCategory)session.load(TodoCategory.class, _taskId);
		if(null != _todoCategory){
			session.delete(_todoCategory);
		}
		logger.info("Category deleted successfully, category details = " + _todoCategory);
	}

	@Override
	public List<TodoTask> listAllTasks(TodoTask listAllTasks) throws SQLException {
		Session session=this.sessionFactory.getCurrentSession();
		
		List<TodoTask> _taskList=session.createQuery("from TodoTask").list();
		for(TodoTask tt : _taskList){
			logger.info("Player List::"+tt);
		}
		return _taskList;
		
	}

	@Override
	public void deleteAllTasks(TodoTask deleteAllTasks) {
		Session session = this.sessionFactory.getCurrentSession();
		String _catId=deleteAllTasks.getCategoryId();
		TodoTask _todoTask=(TodoTask) session.load(TodoTask.class,_catId);
		if(null != _todoTask){
			session.delete(_todoTask);
		}
		logger.info("Category deleted successfully, category details = " + _todoTask);
			
	}

}
