package edu.neu.csye6200;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TwoThread {
	public int flag=1;
	private static Lock lock = new ReentrantLock();
	String s1 ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String s2 = "abcdefghijklmnopqrstuvwxyz";
	int counts1=0;
	int counts2=0;
	public void threadDemo()
	{
		flag =1;
		Thread t1 = new Thread(new Runnable()
				{
			public void run()
			{
				while(counts2<=25)
				{
                lock.lock();
				if(flag%2==1)
				{
					System.out.print(s2.charAt(counts2));
					counts2=counts2+1 ;
					flag = flag+1;
				}
                lock.unlock();
				}
			}
				}
				);
		Thread t2 = new Thread(new Runnable()
		{
	public void run()
	{
		while(counts1<=25) {
		lock.lock();
		if(flag%2==0)
		{
			System.out.print(s1.charAt(counts1));
			counts1=counts1+1 ;
			flag = flag+1;
		}
		lock.unlock();
		}
	}
		}
		);
		t1.start();
		t2.start();
		
	}

}
