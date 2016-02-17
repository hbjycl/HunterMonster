package com.hbjycl.entity;

/**
 * Created by hbjycl on 2016/2/1.
 */
public class Sword extends Weapon {


    public Sword(String name) {
        this.setName(name);
        this.setDesc("剑");
    }

    @Override
    public int demage(Hunter hunter, Enemy enemy) {
        int d = enemy.injured(hunter);
        return d;
    }
}
