package com.hbjycl.decorator;

import com.hbjycl.entity.Enemy;
import com.hbjycl.entity.Hunter;
import com.hbjycl.entity.Weapon;

/**
 * Created by hbjycl on 2016/2/17.
 */
public class DecreseAglieSkill extends SkillDecorator {
    private Weapon weapon;
    private int s;


    @Override
    public String getDesc() {
        return "降低敏捷的"+weapon.getDesc();
    }

    @Override
    public int demage(Hunter hunter, Enemy enemy) {
        return 0;
    }
}
