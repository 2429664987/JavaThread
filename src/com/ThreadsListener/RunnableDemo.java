package com.ThreadsListener;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class RunnableDemo implements Runnable{

	@Override
	public void run() {
		timer1();
		timer2();
		timer3();
		timer4();
	}

	 // 第一种方法：设定指定任务task在指定时间time执行 schedule(TimerTask task, Date time)  
    public static void timer1() {  
        Timer timer = new Timer();  
        timer.schedule(new TimerTask() {  
            public void run() {  
                System.out.println("-------设定要指定任务timer1--------");  
            }  
        }, 2000);// 设定指定的时间time,此处为2000毫秒  
    } 
    
    // 第二种方法：设定指定任务task在指定延迟delay后进行固定延迟peroid的执行  
    // schedule(TimerTask task, long delay, long period)  
    public static void timer2() {  
        Timer timer = new Timer();  
        timer.schedule(new TimerTask() {  
            public void run() {  
                System.out.println("-------设定要指定任务timer2--------");  
            }  
        }, 1000, 4000);  
    }  
    // 第一种方法：设定指定任务task在指定时间time执行 schedule(TimerTask task, Date time)  
    public static void timer3() {  
        Timer timer = new Timer();  
        timer.schedule(new TimerTask() {  
            public void run() {  
                System.out.println("-------设定要指定任务timer3--------");  
            }  
        }, 1000,3000);// 设定指定的时间time,此处为2000毫秒  
    } 
    
    
    
    public static void timer4() {  
    	Calendar calendar = Calendar.getInstance();  
        calendar.set(Calendar.HOUR_OF_DAY, 11); // 控制时  
        calendar.set(Calendar.MINUTE, 27);       // 控制分  
        calendar.set(Calendar.SECOND, 0);       // 控制秒  
        Date time = calendar.getTime();         // 得出执行任务的时间,此处为今天的11：27：00  
  
        Timer timer = new Timer();  
        timer.scheduleAtFixedRate(new TimerTask() {  
            public void run() {  
                System.out.println("-------++++++++++++++++++++++++++++++++timer4--------");  
            }  
        }, time, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行 
    } 
	
}
