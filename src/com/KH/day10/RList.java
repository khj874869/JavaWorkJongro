package com.KH.day10;

public class RList<T> {
	Object [] object;
	int size;
	public RList() {
		object = new Object[3];
		size = 0;
	}
	public void add(T input) {
		object[size] = input;
		size++;
	}
	public T get(int index) {
		return (T)object[index];
	}
	public int size() {
		return size;
	}
	public void clear() {
		object = new Object[3];
		size=0;
	}
}
