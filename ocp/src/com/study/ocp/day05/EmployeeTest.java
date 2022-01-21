package com.study.ocp.day05;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("James", 28, 10_000);
		System.out.println(e1);
		e1.setName("John");
		e1.setAge(30);
		e1.setSalary(50000);
		System.out.println(e1.toString());
		System.out.println(e1); // 相當於呼叫 e1.toString()
		Employee e2 = new Employee();
		// 建立員工陣列
		// 使用 Employee[] 就不可以再次增加員工
		Employee[] employees1 = {e1, e2};
		System.out.println(employees1);
		
		// 若使用 List.of 就不可以再次增加員工
		List<Employee> employees = List.of(e1, e2);
		System.out.println(employees);
//		employees.add(e1, e2); // 有 List.of(e1, e2) 就不能再用 add 需動態增加
		
		// 若使用 new ArrayList<>() 可以任意增加/刪減員工
		ArrayList<Employee> employees3 = new ArrayList<>();
		employees3.add(e1);
		employees3.add(e2);
		System.out.println(employees3);	
	}
}
