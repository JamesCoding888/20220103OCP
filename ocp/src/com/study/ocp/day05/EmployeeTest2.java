package com.study.ocp.day05; 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class EmployeeTest2 {
	public static void main(String[] args) {
		// 建立員工物件
		Employee e1 = new Employee("John", 25, 50000);
		Employee e2 = new Employee("Mary", 27, 60000);
		Employee e3 = new Employee("Mark", 31, 90000);
		// 1. 請求出總薪資 = ?
		int sum1 = e1.getSalary() + e2.getSalary() + e3.getSalary();
		System.out.println("總薪資: " + sum1);
		// 2. 請求出總薪資 = ?
		Employee[] employees = {e1, e2, e3};
		int sum2 = 0 ;
		for(Employee emp : employees) {
			sum2 += emp.getSalary();
		}
		System.out.println("總薪資: " + sum2);
		// 3. 請求出總薪資 = ?  ; 使用 Java 8 
		List<Employee> employees_Stream = new ArrayList<>();
		employees_Stream.add(e1);
		employees_Stream.add(e2);
		employees_Stream.add(e3);
		int sum3 = employees_Stream.stream().mapToInt(emp -> emp.getSalary()).sum();
		System.out.printf("總薪資: %d\n", sum3);
		// 4. 請求出總薪資 = ?  ; 使用 Java 8
		int sum4 = Arrays.stream(employees).mapToInt(emp -> emp.getSalary()).sum();
		System.out.printf("總薪資: %d\n", sum4);
		// 5. 請求出總薪資 = ?  ; 使用 Java 8
		int sum5 = Arrays.stream(employees).mapToInt(Employee::getSalary).sum();
		System.out.printf("總薪資: %d\n", sum5);
		
		// Homework employees 可以依照薪資大小排序
		Arrays.stream(employees).mapToInt(emp -> emp.getSalary()).sorted().forEach(System.out::println);	
	}
}


