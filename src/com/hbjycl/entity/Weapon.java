package com.hbjycl.entity;

/**
 * Created by hbjycl on 2016/1/31.
 */
public abstract class Weapon {
    private String desc;
    private String name;
    private boolean hasSuckBlood;
    private boolean hasDeA;
    private boolean hasDeD;

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

    public boolean isHasSuckBlood() {
        return hasSuckBlood;
    }

    public void setHasSuckBlood(boolean hasSuckBlood) {
        this.hasSuckBlood = hasSuckBlood;
    }

    public boolean isHasDeA() {
        return hasDeA;
    }

    public void setHasDeA(boolean hasDeA) {
        this.hasDeA = hasDeA;
    }

    public boolean isHasDeD() {
        return hasDeD;
    }

    public void setHasDeD(boolean hasDeD) {
        this.hasDeD = hasDeD;
    }

    public abstract int demage(Hunter hunter, Enemy enemy);

}
