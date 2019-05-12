package com.frankie.dao;

import java.util.List;

public abstract class BaseDao<T> {

    public abstract T getById(int id);

    public abstract List<T> getEntityList();

    public abstract void deleteById(int id);

    public abstract void update(T t);

}
