package com.hbjycl.util;

import com.hbjycl.entity.Monster;

public class ShowUtil {

	public static void show(Monster monster)
	{
		System.out.println("怪物："+monster.getType()+"被击中，生命值变为："+monster.getCurLife());
	}
}
