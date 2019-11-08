package com.sunwx.dtscommon.model;

import java.io.Serializable;

public class User implements Serializable {
  public String name;
  public String age;
  
  
public User() {
}
public User(String name, String age) {
	this.name = name;
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
  
}
