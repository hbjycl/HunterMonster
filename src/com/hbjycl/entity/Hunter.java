package com.hbjycl.entity;

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
		this.defend = 10;
		this.level = 1;
		this.exp = 0;
		this.agile = 35;
		this.hideRate = 100;
	}

	public void fight(Enemy enemy) {
		if (!this.isLive()) {
			return;
		}
		if (!enemy.isLive()) {
			return;
		}
		System.out.println("***" + this.name + "(生命值：" + curLife + ")***挥舞着"
				+ this.weapon + "杀向" + enemy.getType());
		enemy.injured(this);
	}

	public int injured(Enemy enemy) {
		if (GameUtil.hidden(agile, hideRate)) {
			System.out.println(name + "躲过了此次攻击！");
			fight(enemy);
			return 0;
		}
		int lostLife = GameUtil.calLostLife(enemy.getAttack(), defend);
		System.out.println(name + "受伤了，损失生命值：" + lostLife);
		curLife -= lostLife;
		if (this.curLife <= 0) {
			dead();
			
		}
		System.out.println(name + "(生命值：" + curLife + "):小样！ 敢打我！");
		fight(enemy);
		return lostLife;
	}

	public void dead() {
		this.isLive = false;
		System.out.println("--玩家死亡--" + name + "：啊！天妒英才");
		return;
	}

	public void expAdd(Enemy enemy) {
		this.exp += enemy.getMaxLife();
		System.out.println("恭喜玩家:" + name + ",本次获得经验：" + enemy.getMaxLife());
		int needExp = 0;
		for (int i = 1; i < this.level+1; i++) {
			needExp += 50;
		}
		if (this.exp >= needExp) {
			this.upgrade();
		}
	}

	public void upgrade() {
		this.attack += 5;
		this.defend += 3;
		this.maxLife += 40;
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
