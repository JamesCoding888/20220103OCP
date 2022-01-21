package com.study.ocp.day05;

import java.util.Objects;

public class Employee {
	// 物件屬性 / 物件變數 / 物件資產
	private String name;
	private Integer age;
	private Integer salary;
	
	
	// 封裝 (建構子 , 方法)
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, Integer age, Integer salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	// 封裝的目的，就是設定 getter and setter 物件屬性的資料
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}	

	// equals and hashcode 
	@Override
	public int hashCode() {
		return Objects.hash(age, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(age, other.age) && Objects.equals(name, other.name)
				&& Objects.equals(salary, other.salary);
	}	
	
	// 印出物件的內容
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}
