package com.study.ocp.day22;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeRead {

	public static void main(String[] args) {
		String filePath = "src\\com\\study\\ocp\\day22\\john.ser";
		try(FileInputStream fis = new FileInputStream(filePath);
			ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Employee emp = (Employee)(ois.readObject());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}