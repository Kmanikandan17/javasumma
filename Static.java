package org.hm;

public class Static {
	
static int age=10;
	
	
	private void add() {
		
		System.out.println(++age);
		
	
	}
	public static void main(String[] args) {
		Static s=new Static();
		s.add();
		
		System.out.println(++age);
		
	}

}
