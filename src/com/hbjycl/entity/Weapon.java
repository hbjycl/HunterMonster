package com.hbjycl.entity;

/**
 * Created by hbjycl on 2016/1/31.
 */
public abstract class Weapon {
    private String desc;
    private String name;


    public Weapon() {
    }

    public Weapon(String desc, String name) {
        this.desc = desc;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract int demage(Hunter hunter, Enemy enemy);

}
