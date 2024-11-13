package com.etno.models.service;

public interface GenericService<T, R, ID> {
	
	public R create(T entity);
	
	public R update(ID id, T entity);
	
	public void deleteById(ID id);
	
	public R findById(ID id);
}
