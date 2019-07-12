package com.polaris.alertLayoutDesign.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class sample extends Thread implements Runnable {
	public void run()
	{
		System.out.println("Threads started..");
		List<String> l = new ArrayList<String>();
		l.add("b");
		l.add("a");
		l.add("a");
		l.add("e");
		l.add("d");
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		Collections.sort(l, Collections.reverseOrder());
		System.out.println(l);
		System.out.println(l.size());
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Thread Execution Starts here..");
		Runnable t1 = new sample();
		Runnable t2 = new sample();
		Runnable t3 = new sample();
		Runnable t4 = new sample();
		Runnable t5 = new sample();
		
		ExecutorService pool = Executors.newFixedThreadPool(5);
		pool.execute(t1);
		pool.execute(t3);
		pool.execute(t2);
		pool.execute(t4);
		pool.execute(t5);
		
		pool.shutdown();
		
		
	}

}
