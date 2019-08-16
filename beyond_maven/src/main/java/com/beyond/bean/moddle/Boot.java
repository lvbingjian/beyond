package com.beyond.bean.moddle;
public class Boot {
	public Boot(String name,int id) {
		this.name = name;
		this.id = id;
	} 
private String name;
private int id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String toString() {
	return "Boot [name=" + name + ", id=" + id + "]";
}

}
