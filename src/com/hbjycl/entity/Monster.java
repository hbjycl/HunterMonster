package com.hbjycl.entity;

import com.hbjycl.util.GameUtil;

public class Monster extends Enemy {

    public Monster(int mt) {
        setLive(true);
        setHideRate(100);
        if (mt == 1) {
            setType("普通僵尸");
            setMaxLife(40);
            setAttack(15);
            setDefend(8);
            setAgile(20);
        } else if (mt == 2) {
            setType("魔法僵尸");
            setMaxLife(35);
            setAttack(27);
            setDefend(5);
            setAgile(25);
        } else if (mt == 3) {
            setType("肉盾僵尸");
            setMaxLife(40);
            setAttack(10);
            setDefend(19);
            setAgile(80);
        } else if (mt == 4) {
            setType("僵尸王");
            setMaxLife(100);
            setAttack(20);
            setDefend(20);
            setAgile(20);
        }
        setCurLife(getMaxLife());
    }

    public void kill(Hunter hunter) {
        if (!this.isLive()) {
            return;
        }
        if (!hunter.isLive()) {
            return;
        }
        System.out.println(getType() + ":呼呼呼呼呼呼呼呼呼呼呼," + getType() + "杀向***"
                + hunter.getName() + "***");
        hunter.injured(this);
    }


    @Override
    public void dead(Hunter hunter) {
        setLive(false);
        System.out.println(getType() + ":哇哇哇啊哇哇哇," + getType() + "死亡");
        hunter.expAdd(this);
    }

}
