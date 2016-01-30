package com.hbjycl.entity;

import com.hbjycl.util.GameUtil;

public class Vampire extends Enemy{

	public Vampire(int vt) {
		setLive(true); 
		setHideRate(100);
		if (vt == 1)
		{
			setType("吸血蝙蝠");
			setMaxLife(40);
			setAttack(15);
			setDefend(8);
			setAgile(20);
		} else if (vt == 2) {
			setType("吸血鬼");
			setMaxLife(35);
			setAttack(27);
			setDefend(5);
			setAgile(25);
		} else if (vt == 3) {
			setType("吸血僵尸");
			setMaxLife(40);
			setAttack(10);
			setDefend(19);
			setAgile(80);
		} else if (vt == 4) {
			setType("吸血女王");
			setMaxLife(100);
			setAttack(20);
			setDefend(20);
			setAgile(20);
		}
		setCurLife(getMaxLife());
	}
	
	@Override
	public void kill(Hunter hunter) {
		if (!this.isLive()) {
			return;
		}
		if (!hunter.isLive()) {
			return;
		}
		System.out.println(getType() + ":呼呼呼呼呼呼呼呼呼呼呼," + getType() + "杀向***"
				+ hunter.getName() + "***");
		int suckLife = hunter.injured(this);
		suckLife(suckLife);
		System.out.println(getType()+"吸收血量："+suckLife+"此时血量为:"+getCurLife());
	}
	
	
	public void suckLife(int damage){
		setCurLife(getCurLife()+damage);
		
	}



	@Override
	public void dead(Hunter hunter) {
		setLive(false);
		System.out.println(getType() + ":哇哇哇啊哇哇哇," + getType() + "死亡");
		hunter.expAdd(this);
	}

}
