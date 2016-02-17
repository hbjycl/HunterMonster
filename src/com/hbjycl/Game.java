package com.hbjycl;

import com.hbjycl.entity.Enemy;
import com.hbjycl.entity.Hunter;
import com.hbjycl.entity.Monster;
import com.hbjycl.entity.Vampire;
import com.hbjycl.util.GameUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
    Hunter hunter;
    List<Enemy> enemys;

    public Game(Hunter hunter) {
        this.hunter = hunter;
        enemys = new ArrayList<Enemy>();
        enemys.add(new Monster(1));
        enemys.add(new Monster(2));
        enemys.add(new Monster(3));
        enemys.add(new Monster(4));
        enemys.add(new Vampire(1));
        enemys.add(new Vampire(2));
        enemys.add(new Vampire(3));
        enemys.add(new Vampire(4));

    }

    public void start() {
        while (true) {
            int ran = GameUtil.randomRange(0, enemys.size());
            Enemy enemy = enemys.get(ran);
            hunter.fight(enemy);
            if (!enemy.isLive()) {
                enemys.remove(ran);
            }
            if (!hunter.isLive()) {
                end();
                return;
            }
            if (enemys.size() <= 0) {
                end();
                return;
            }
            try {
                System.out
                        .println("------------------寻找对手中--------------------");
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void end() {
        if (hunter.isLive()) {
            System.out.println("-----------------恭喜通关!!!!----------------");

        } else {
            System.out.println("大侠不要气馁，是否再来一局？");
        }
    }
}
