package com.KH.day10.collection.list;

public class ObjectList {
	Object [] object;
	int size;
	public ObjectList () {
		object = new Object[3];
		size = 0; 
	}
	public void add(Object input) {
		object[size] = input;
		size++;
	}
	public Object get(int index) {
		return object[index];
	}
	public void Clear() {
		object = new Object[3];
		size = 0;
	}
}
