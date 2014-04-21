package com.ekaro.dao;

import java.util.List;

import com.ekaro.pojo.Parent;

public class ParentDao {
    List<Parent> parents;
    public ParentDao(List<Parent> parents)
    {
    	this.parents = parents;
    }
	public void addParent(Parent parent)
	{
		parents.add(parent);
	}
}
