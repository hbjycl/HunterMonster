package com.hbjycl.Service;

import com.hbjycl.entity.Hunter;
import com.hbjycl.entity.Monster;

public interface HunterService {

	/*
	 * 输出伤害，拿起武器挥向怪物
	 */
	public void fight(Hunter hunter,Monster monster);
	
	/*
	 * 怪物被击中，大叫一声
	 */
	public void injured(Monster monster);
}
