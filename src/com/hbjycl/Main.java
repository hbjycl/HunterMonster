package com.hbjycl;

import com.hbjycl.entity.Axe;
import com.hbjycl.entity.Hunter;
import com.hbjycl.entity.Sword;
import com.hbjycl.entity.Weapon;

public class Main{
	public static void main(String[] args)
	{
		Hunter hunter = new Hunter("地狱领主", new Axe("霜之哀伤"));
		new Game(hunter).start();
	}
}
