package com.ThreadsListener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ThreadsListener implements ServletContextListener{
	//���������Container��ʼ������WebӦ��ʱ���ã������ڸ�WebӦ����servlet��filter��ʼ��֮ǰ
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}
	//���������Containerж������WebӦ��ʱ���ã������ڸ�WebӦ����servlet��filter��destroy()����֮��
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		new Thread(new RunnableDemo()).start();
	}

}
