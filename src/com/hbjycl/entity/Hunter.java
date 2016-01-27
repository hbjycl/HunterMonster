package com.hbjycl.entity;

import com.hbjycl.appconst.AppConst;
import com.hbjycl.util.GameUtil;

public class Hunter {

	private int curLife;
	private int maxLife;
	private String name;
	private boolean isLive;
	private String weapon;
	private int attack;
	private int defend;
	private int level;
	private int exp;
	private int agile;
	private int hideRate;

	public Hunter(String name, String weapon) {
		this.name = name;
		this.weapon = weapon;
		this.curLife = 100;
		this.maxLife = curLife;
		this.isLive = true;
		this.attack = 25;
		this.defend = 8;
		this.level = 1;
		this.exp = 0;
		this.agile = 35;
		this.hideRate = 100;
	}

	public void fight(Monster monster) {
		if (!this.isLive()) {
			return;
		}
		if (!monster.isLive()) {
			return;
		}
		System.out.println("***" + this.name + "(生命值：" + curLife + ")***挥舞着"
				+ this.weapon + "杀向" + monster.getType());
		monster.injured(this);
	}

	public void injured(Monster monster) {
		if (GameUtil.hidden(agile, hideRate)) {
			System.out.println(name + "躲过了此次攻击！");
			fight(monster);
			return;
		}
		int lostLife = GameUtil.calLostLife(monster.getAttack(), defend);
		System.out.println(name + "受伤了，损失生命值：" + lostLife);
		curLife -= lostLife;
		if (this.curLife <= 0) {
			dead();
			return;
		}
		System.out.println(name + "(生命值：" + curLife + "):小样！ 敢打我！");
		fight(monster);
	}

	public void dead() {
		this.isLive = false;
		System.out.println("啊！天妒英才,玩家:" + name + "死亡！");
		return;
	}

	public void expAdd(Monster monster) {
		this.exp += monster.getMaxLife();
		System.out.println("恭喜玩家:" + name + ",本次获得经验：" + exp);
		int needExp = 0;
		for (int i = 1; i < this.level+1; i++) {
			needExp += 50;
		}
		if (this.exp >= needExp) {
			this.upgrade();
		}
	}

	public void upgrade() {
		this.attack += 4;
		this.defend += 3;
		this.maxLife += 30;
		this.curLife = maxLife;
		this.level++;
		System.out.println("************" + this.name + ",Levle up************"
				+ "等级为:" + level);
	}

	public int getCurLife() {
		return curLife;
	}

	public void setCurLife(int curLife) {
		this.curLife = curLife;
	}

	public int getMaxLife() {
		return maxLife;
	}

	public void setMaxLife(int maxLife) {
		this.maxLife = maxLife;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isLive() {
		return isLive;
	}

	public void setLive(boolean isLive) {
		this.isLive = isLive;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefend() {
		return defend;
	}

	public void setDefend(int defend) {
		this.defend = defend;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Hunter [curLife=" + curLife + ", maxLife=" + maxLife + ", name="
				+ name + ", isLive=" + isLive + ", weapon=" + weapon
				+ ", attack=" + attack + ", defend=" + defend + ", level="
				+ level + ", exp=" + exp + "]";
	}

}
