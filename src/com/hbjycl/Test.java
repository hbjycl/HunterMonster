package com.hbjycl;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		School middle = new MiddleSchool();
		middle.name = "123";
		middle.show();
		MiddleSchool m = (MiddleSchool) middle;
		m.show1();
	}
}
class School {
	String name;
	public void show(){
		System.out.println(name);
	}
}

class MiddleSchool extends School {
	private int age;
	public void show1(){
		System.out.println("show1:"+name);
	}
	public void show(){
		System.out.println("chidren:"+name);
	}
	
}