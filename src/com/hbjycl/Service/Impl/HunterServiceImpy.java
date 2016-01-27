package com.hbjycl.Service.Impl;

import com.hbjycl.Service.HunterService;
import com.hbjycl.entity.Hunter;
import com.hbjycl.entity.Monster;
import com.hbjycl.util.ShowUtil;

public class HunterServiceImpy implements HunterService {

	@Override
	public void fight(Hunter hunter,Monster monster) {
		System.out.println("------>"+hunter.getName()+"������"+hunter.getWeapon()+"ɱ��"+monster.getType());
		monster.setCurLife(20);
		ShowUtil.show(monster);
	}

	@Override
	public void injured(Monster monster) {
		System.out.println("������һ������������������");
	}

}
