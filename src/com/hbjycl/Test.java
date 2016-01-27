package com.hbjycl;

public class Test {

	public static void main(String[] args)
	{
		for(int i = 0 ;i<100;i++)
		{
			System.out.println((int)(Math.random()*10));
		}
	  
	}
}
class Bag{
	Book a = new Book(1);
	Book b = new Book(2);
	public Bag(){
		System.out.println("bag");
	}
}

class Book{
	public Book(int name)
	{
		System.out.println("book"+name);
	}
}