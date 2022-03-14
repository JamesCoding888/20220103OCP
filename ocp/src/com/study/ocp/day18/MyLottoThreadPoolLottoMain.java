package com.study.ocp.day18;
import java.util.concurrent.Executors; 
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
public class MyLottoThreadPoolLottoMain {
	public static void main(String[] args) throws Exception {
		ThreadPoolExecutor exec = (ThreadPoolExecutor)Executors.newCachedThreadPool();
		Future t1 = exec.submit(new Lotto());
		System.out.println(t1.get());
		exec.submit(new Lotto()).get();
		exec.submit(new Lotto()).get();
		exec.submit(new Lotto()).get();
		exec.submit(new Lotto()).get();
		exec.submit(new Lotto()).get();
		exec.shutdown();
	}
}
