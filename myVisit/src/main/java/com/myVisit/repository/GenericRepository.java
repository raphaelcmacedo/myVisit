package com.myVisit.repository;

import java.util.List;

import com.myVisit.entity.GenericEntity;

public interface GenericRepository<T extends GenericEntity> {
	public List<T> listAll();
	public T findById(int id);
	public T save(T entity);
	public void delete(T entity);
}
