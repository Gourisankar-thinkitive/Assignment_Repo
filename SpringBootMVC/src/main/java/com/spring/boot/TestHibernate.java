package com.spring.boot;

public class TestHibernate {
	public static void main(String[] args) {
		
		Services s = new Services();
		
		s.hibernateOps(new Employee(1,"ABCD",20000));
	}
}
