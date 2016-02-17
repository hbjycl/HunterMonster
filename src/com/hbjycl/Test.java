package com.hbjycl;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		for(int i = 0;i<100;i++)
		{
			System.out.println("");
		}

	}
}
class Student {
	String name;
	Book b;
	public Student(String name,Book b)
	{
		super();
		this.name = name;
		this.b= b;
	}

	public void read(){
		System.out.println(this.name+"正在读："+b);
	}
}

class Book {
	String name;
	public Book(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
