package com.study.ocp.day22;
class Foo implements AutoCloseable{
	@Override
	public void close() throws Exception {
		System.out.println("Close Foo");	
	}
}
class Bar implements AutoCloseable{
	@Override
	public void close() throws Exception {
		System.out.println("Close Bar");
	}
}
public class AutoCloseableDemo {
	public static void main(String[] args) {
		try(Bar bar = new Bar();
			Foo foo = new Foo();) { // 注意誰先被關閉!!! 由右到左			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
