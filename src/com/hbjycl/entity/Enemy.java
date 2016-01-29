package com.hbjycl.entity;

import com.hbjycl.util.GameUtil;

public abstract class Enemy {

	private String type;
	private boolean isLive;
	private int curLife;
	private int maxLife;
	private int attack;
	private int defend;
	private int agile;
	private int hideRate;

	public abstract void injured(Hunter hunter);

	public abstract void kill(Hunter hunter);

	public abstract void dead(Hunter hunter);

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isLive() {
		return isLive;
	}

	public void setLive(boolean isLive) {
		this.isLive = isLive;
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

	public int getAgile() {
		return agile;
	}

	public void setAgile(int agile) {
		this.agile = agile;
	}

	public int getHideRate() {
		return hideRate;
	}

	public void setHideRate(int hideRate) {
		this.hideRate = hideRate;
	}

	@Override
	public String toString() {
		return "Monster [type=" + type + ", isLive=" + isLive + ", curLife="
				+ curLife + ", maxLife=" + maxLife + ", attack=" + attack
				+ ", defend=" + defend + "]";
	}

}
