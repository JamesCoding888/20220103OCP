package com.study.ocp.day22;
import java.io.Serializable;  
import java.util.Random;
public class Employee implements Serializable {
	private String name;
	private transient Integer salary; // 不想被序列化 加上 transient
//	private Integer salary; // 不想被序列化
	public Employee(String name) {
		super();
		this.name = name;
		this.salary = new Random().nextInt(30000);
	}
	public Employee() {
		super();		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" 
				+ salary + "]";
	}
}
