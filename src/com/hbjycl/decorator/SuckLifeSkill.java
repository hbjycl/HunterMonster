package com.hbjycl.decorator;

import com.hbjycl.entity.Enemy;
import com.hbjycl.entity.Hunter;
import com.hbjycl.entity.Weapon;

/**
 * Created by hbjycl on 2016/2/17.
 */
public class SuckLifeSkill extends SkillDecorator {
    private Weapon weapon;
    private int getLifeRate;


    public SuckLifeSkill(Weapon weapon, int getLifeRate) {
        this.weapon = weapon;
        this.getLifeRate = getLifeRate;
        this.setName(weapon.getName());
    }

    @Override
    public String getDesc() {
        return "吸血的" + weapon.getDesc();
    }

    @Override
    public int demage(Hunter hunter, Enemy enemy) {
        int damage = weapon.demage(hunter, enemy);
        if (damage > 0) {
            suckLife(damage, hunter);
        }
        return damage;
    }

    public void suckLife(int damage, Hunter hunter) {
        int addLife = damage*getLifeRate/100;
        System.out.println(hunter.getName()+"吸血成功，吸取"+addLife);
        if(addLife+hunter.getCurLife()>=hunter.getMaxLife())
        {
            hunter.setCurLife(hunter.getMaxLife());
        }
        else{
            hunter.setCurLife(hunter.getCurLife()+addLife);
        }
    }
}

