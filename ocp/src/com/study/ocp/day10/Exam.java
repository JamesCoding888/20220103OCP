package com.study.ocp.day10;

public class Exam {
	private String name;
	private Integer score;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exam(String name, Integer score) {
		super();
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Exam [name=" + name + ", score=" + score + "]";
	}
	
}
