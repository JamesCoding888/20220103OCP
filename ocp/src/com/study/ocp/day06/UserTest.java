package com.study.ocp.day06;
public class UserTest {
	public static void main(String[] args) {
		User user = new User();
		user.setName("Vincent");
		System.out.println(user.getName());
		user.setAge(18);
		System.out.println(user.getAge());
		System.out.println(user);		
		User user2 = new User("Anita", 19);
		System.out.println(user2);
	}
}