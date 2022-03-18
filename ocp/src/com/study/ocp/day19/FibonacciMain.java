package com.study.ocp.day19;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class FibonacciMain {

	public static void main(String[] args) {
		int num = 45;
		long startTime, endTime, result;
		// Recursive 傳統遞迴
		startTime = System.currentTimeMillis();
		result = new Fibonacci().fib(num);
		endTime = System.currentTimeMillis();
		System.out.printf("Recursive fib(%d) = %d in %d ms\n", num, result, (endTime-startTime));
		// Forkjoin 速度比 Recursive 快
		ForkJoinTask<Long> task = new FibonacciTask(num);
		int proc = Runtime.getRuntime().availableProcessors();
		ForkJoinPool pool = new ForkJoinPool(proc);
		startTime = System.currentTimeMillis();
		result = pool.invoke(task);
		endTime = System.currentTimeMillis();
		System.out.printf("Forkjoin fib(%d) = %d in %d ms\n", num, result, (endTime-startTime));
	}
}
