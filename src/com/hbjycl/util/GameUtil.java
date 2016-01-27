package com.hbjycl.util;

public class GameUtil {
	public static int BASIC_LIFE = 7;
	
	//·µ»Ø¶ªÊ§µÄÉúÃü
	public static int calLostLife(int attack, int defend){
		int lostLife = attack - defend + GameUtil.BASIC_LIFE;
		int rel = 0;
		if (lostLife <= 0) {
			rel = GameUtil.BASIC_LIFE;
		} else {
			rel = lostLife + GameUtil.BASIC_LIFE;
		}
		return rel;
	}

	public static int randomRange(int start,int end)
	{
		return (int)(Math.random()*(end-start)+start);
	}
	
	public static boolean hidden(int agile,int hideRate){
		int sucRate =  agile*hideRate/100;
		int ran  = randomRange(1,101);
		if(ran<sucRate)
		{
			return true;
		}
		return false;
	}
}
