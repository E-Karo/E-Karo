package com.ekaro.pojo;

public enum SchoolYear {
    NURSERY("Kindergarten",0),
    CLASS_ONE("Class One",1),
    CLASS_TWO("Class Two", 2);
    
    String description;
    int code;
    
    SchoolYear(String description, int code)
    {
    	this.description = description;
    	this.code = code;
    }
}
