package com.hbjycl.entity;

/**
 * Created by hbjycl on 2016/1/31.
 */
public class Weapon {
    private String desc;

    public Weapon(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int demage(Hunter hunter, Enemy enemy) {
        int d = enemy.injured(hunter);
        return d;
    }
}
