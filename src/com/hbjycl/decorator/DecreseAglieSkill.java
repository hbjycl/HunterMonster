package com.hbjycl.decorator;

import com.hbjycl.entity.Enemy;
import com.hbjycl.entity.Hunter;
import com.hbjycl.entity.Weapon;

/**
 * Created by hbjycl on 2016/2/17.
 */
public class DecreseAglieSkill extends SkillDecorator {
    private Weapon weapon;
    private int deAgileNum;


    public DecreseAglieSkill(Weapon weapon, int deAgileNum) {
        this.weapon = weapon;
        this.deAgileNum = deAgileNum;
        this.setName(weapon.getName());
    }

    @Override
    public String getDesc() {
        return "降低敏捷的" + weapon.getDesc();
    }

    @Override
    public int demage(Hunter hunter, Enemy enemy) {

        int damage = weapon.demage(hunter, enemy);
        if (damage > 0) {

            descreaseAglie(enemy);
        }
        return damage;
    }

    private void descreaseAglie(Enemy enemy) {
        int td = enemy.getAgile()-deAgileNum;
        if(td<0)
        {
            enemy.setAgile(0);
            System.out.println(enemy.getType()+"的敏捷下降为0");
        }
        else{
            enemy.setAgile(td);
            System.out.println(enemy.getType()+"的敏捷下降了:"+td);
        }

    }

}
