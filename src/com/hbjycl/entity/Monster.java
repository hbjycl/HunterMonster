package com.hbjycl.entity;

import com.hbjycl.util.GameUtil;

public class Monster {

	private String type;
	private boolean isLive;
	private int curLife;
	private int maxLife;
	private int attack;
	private int defend;
	private int agile;
	private int hideRate;

	public Monster(int mt) {
		this.isLive = true;
		this.agile = 35;
		this.hideRate = 100;
		if (mt == 1)

		{
			this.type = "��ͨ��ʬ";
			this.maxLife = 40;
			this.attack = 15;
			this.defend = 8;
			this.agile = 20;
		} else if (mt == 2) {
			this.type = "ħ����ʬ";
			this.maxLife = 35;
			this.attack = 40;
			this.defend = 5;
			this.agile = 15;
		} else if (mt == 3) {
			this.type = "��ܽ�ʬ";
			this.maxLife = 100;
			this.attack = 5;
			this.defend = 15;
			this.agile = 10;
		} else if (mt == 4) {
			this.type = "��ʬ";
			this.maxLife = 60;
			this.attack = 30;
			this.defend = 10;
			this.agile = 40;
		}
		this.curLife = maxLife;
	}

	public void injured(Hunter hunter) {
		if (GameUtil.hidden(agile, hideRate)) {
			System.out.println(type + "����˴˴ι�����");
		}

		else {
			int lostLife = GameUtil.calLostLife(hunter.getAttack(), defend);
			curLife -= lostLife;
			System.out.println(
					type+"(����ֵΪ:"+curLife + "):��Ŷ����Ŷ��Ŷ����" + type + "�����ˣ���ʧ����ֵ��" + lostLife);
			if (this.getCurLife() <= 0) {
				dead(hunter);
				return;
			}
		}
		// ��ʬ����
		kill(hunter);
	}

	public void kill(Hunter hunter) {
		if (!this.isLive()) {
			return;
		}
		if (!hunter.isLive()) {
			return;
		}
		System.out.println(this.type + ":����������������������," + type + "ɱ��***"
				+ hunter.getName() + "***");
		hunter.injured(this);
	}

	public void dead(Hunter hunter) {
		isLive = false;
		System.out.println(this.type + ":�����۰�������," + type + "����");
		hunter.expAdd(this);
	}

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
