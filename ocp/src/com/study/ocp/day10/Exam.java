package com.study.ocp.day10;
public class Exam implements Comparable<Exam> {
	private String name;
	private Integer score;
	
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public Exam(String name, Integer score) {
		super();
		this.name = name;
		this.score = score;
	}

	// Either Exam has to implement Comparable, 
    //	 or you need to provide a comparator when creating the TreeSet.
	@Override
	public int compareTo(Exam o) {
		// TODO Auto-generated method stub
		return score - o.getScore();		
	}

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

	@Override
	public String toString() {
		return "Exam [name=" + name + ", score=" + score + "]";
	}	
}
