package com.hbjycl.util;

import com.hbjycl.entity.Monster;

public class ShowUtil {

	public static void show(Monster monster)
	{
		System.out.println("���"+monster.getType()+"�����У�����ֵ��Ϊ��"+monster.getCurLife());
	}
}
