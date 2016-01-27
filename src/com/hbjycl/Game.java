package com.hbjycl;

import com.hbjycl.entity.Hunter;
import com.hbjycl.entity.Monster;
import com.hbjycl.util.GameUtil;

public class Game {
	Hunter hunter;
	Monster m1, m2, m3, m4;
	public Game(Hunter hunter) {
		this.hunter = hunter;
		m1 = new Monster(1);
		m2 = new Monster(2);
		m3 = new Monster(3);
		m4 = new Monster(4);
	}
	public void start() {
		while (true) {
			int ran = GameUtil.randomRange(1, 5);
			switch (ran) {
				case 1 :
					hunter.fight(m1);
					break;
				case 2 :
					hunter.fight(m2);
					break;
				case 3 :
					hunter.fight(m3);
					break;
				case 4 :
					hunter.fight(m4);
					break;
				default :
					System.out.println("拜托！找个正常的");
					break;

			}
			if (!hunter.isLive()) {
				end();
				return;
			}
			if (!m1.isLive() && !m2.isLive() && !m3.isLive() && !m4.isLive()) {
				end();
				return;
			}
			// 让程序休息三秒
			try {
				System.out
						.println("------------------对手寻找中--------------------");
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	public void end() {
		if (hunter.isLive()) {
			System.out.println("-----------------恭喜过关了!!!!----------------");

		} else {
			System.out.println("打下不要气馁，要不要重新来过");
		}
	}
}
