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
					System.out.println("���У��Ҹ�������");
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
						.println("------------------����Ѱ����--------------------");
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	public void end() {
		if (hunter.isLive()) {
			System.out.println("-----------------��ϲ������!!!!----------------");

		} else {
			System.out.println("���²�Ҫ���٣�Ҫ��Ҫ��������");
		}
	}
}
