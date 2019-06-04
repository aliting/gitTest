package com.itqf.pojo;

public class Users {
	
	private  int id;
	private  String  name;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "个人信息是： id="+id+",name="+name+"";
	}

}
