package com.hbjycl.Service;

import com.hbjycl.entity.Hunter;
import com.hbjycl.entity.Monster;

public interface HunterService {

	/*
	 * ����˺������������������
	 */
	public void fight(Hunter hunter,Monster monster);
	
	/*
	 * ���ﱻ���У����һ��
	 */
	public void injured(Monster monster);
}
