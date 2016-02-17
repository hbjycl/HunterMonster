package com.hbjycl.decorator;

import com.hbjycl.entity.Enemy;
import com.hbjycl.entity.Hunter;
import com.hbjycl.entity.Weapon;

/**
 * Created by hbjycl on 2016/2/17.
 */
public class SuckLifeSkill extends SkillDecorator{
    private Weapon weapon;
    private int getLifeRate;


    @Override
    public String getDesc() {
        return "吸血的"+weapon.getDesc();
    }

    @Override
    public int demage(Hunter hunter, Enemy enemy) {
        int damage = weapon.demage(hunter,enemy);
        if(damage>0){


        }
        return damage;
    }

    public int suckLife(int damage,Hunter hunter)
    {
        System.out.println("吸血"+damage*getLifeRate);
        hunter.setCurLife(hunter.getCurLife()+damage*getLifeRate);
        return damage*getLifeRate;
    }
}

