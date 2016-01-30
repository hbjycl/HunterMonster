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

    public void injured(Hunter hunter) {
        if (GameUtil.hidden(getAgile(), getHideRate())) {
            System.out.println(getType() + "躲过了此次攻击！");
        } else {
            int lostLife = GameUtil.calLostLife(hunter.getAttack(),
                    getDefend());
            setCurLife(getCurLife() - lostLife);
            System.out.println(getType() + "(生命值为:" + getCurLife()
                    + "):啊哦嗷嗷嗷嗷哦啊哦啊，" + getType() + "受伤了，损失生命值：" + lostLife);
            if (this.getCurLife() <= 0) {
                dead(hunter);
                return;
            }
        }
        kill(hunter);
    }

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
