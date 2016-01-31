package com.hbjycl;

import com.hbjycl.entity.Hunter;
import com.hbjycl.entity.Weapon;

public class Main{
	public static void main(String[] args)
	{
		Hunter hunter = new Hunter("地狱领主", new Weapon("霜之哀伤之剑"));
		new Game(hunter).start();
	}
}
