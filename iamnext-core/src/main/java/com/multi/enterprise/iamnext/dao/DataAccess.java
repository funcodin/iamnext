package com.multi.enterprise.iamnext.dao;

import org.springframework.dao.DataAccessException;

public interface DataAccess<T> {

	public T create(T create) throws DataAccessException;
	
	public T getById(String id) throws DataAccessException;
	
	public T update(T update) throws DataAccessException;
	
	public T delete(String id) throws DataAccessException;
	
	
}
