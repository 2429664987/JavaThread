package com.ThreadsListener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ThreadsListener implements ServletContextListener{
	//这个方法在Container初始化整个Web应用时调用，运行在该Web应用中servlet和filter初始化之前
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}
	//这个方法在Container卸载整个Web应用时调用，运行在该Web应用中servlet和filter的destroy()方法之后
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		new Thread(new RunnableDemo()).start();
	}

}
