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

	 // ��һ�ַ������趨ָ������task��ָ��ʱ��timeִ�� schedule(TimerTask task, Date time)  
    public static void timer1() {  
        Timer timer = new Timer();  
        timer.schedule(new TimerTask() {  
            public void run() {  
                System.out.println("-------�趨Ҫָ������timer1--------");  
            }  
        }, 2000);// �趨ָ����ʱ��time,�˴�Ϊ2000����  
    } 
    
    // �ڶ��ַ������趨ָ������task��ָ���ӳ�delay����й̶��ӳ�peroid��ִ��  
    // schedule(TimerTask task, long delay, long period)  
    public static void timer2() {  
        Timer timer = new Timer();  
        timer.schedule(new TimerTask() {  
            public void run() {  
                System.out.println("-------�趨Ҫָ������timer2--------");  
            }  
        }, 1000, 4000);  
    }  
    // ��һ�ַ������趨ָ������task��ָ��ʱ��timeִ�� schedule(TimerTask task, Date time)  
    public static void timer3() {  
        Timer timer = new Timer();  
        timer.schedule(new TimerTask() {  
            public void run() {  
                System.out.println("-------�趨Ҫָ������timer3--------");  
            }  
        }, 1000,3000);// �趨ָ����ʱ��time,�˴�Ϊ2000����  
    } 
    
    
    
    public static void timer4() {  
    	Calendar calendar = Calendar.getInstance();  
        calendar.set(Calendar.HOUR_OF_DAY, 11); // ����ʱ  
        calendar.set(Calendar.MINUTE, 27);       // ���Ʒ�  
        calendar.set(Calendar.SECOND, 0);       // ������  
        Date time = calendar.getTime();         // �ó�ִ�������ʱ��,�˴�Ϊ�����11��27��00  
  
        Timer timer = new Timer();  
        timer.scheduleAtFixedRate(new TimerTask() {  
            public void run() {  
                System.out.println("-------++++++++++++++++++++++++++++++++timer4--------");  
            }  
        }, time, 1000 * 60 * 60 * 24);// �����趨����ʱÿ��̶�ִ�� 
    } 
	
}
