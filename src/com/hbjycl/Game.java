package com.hbjycl;

import com.hbjycl.entity.Hunter;
import com.hbjycl.entity.Monster;
import com.hbjycl.entity.Vampire;
import com.hbjycl.util.GameUtil;

public class Game {
	Hunter hunter;
	Monster m1, m2, m3, m4;
	Vampire v1,v2,v3,v4;
	public Game(Hunter hunter) {
		this.hunter = hunter;
		m1 = new Monster(1);
		m2 = new Monster(2);
		m3 = new Monster(3);
		m4 = new Monster(4);
		v1 = new Vampire(1);
		v2 = new Vampire(2);
		v3 = new Vampire(3);
		v4 = new Vampire(4);
		
	}
	public void start() {
		while (true) {
			int ran = GameUtil.randomRange(1, 9);
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
				case 5 :
					hunter.fight(v1);
					break;
				case 6 :
					hunter.fight(v2);
					break;
				case 7 :
					hunter.fight(v3);
					break;
				case 8 :
					hunter.fight(v4);
					break;
				default :
					System.out.println("找不到");
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
			// �ó�����Ϣ����
			try {
				System.out
						.println("------------------寻找对手中--------------------");
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
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
