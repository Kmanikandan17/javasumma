package org.hm;

public class instancevariable {
	
	public int age=1;
	
	private void add() {
		
		System.out.println(++age);
		

	}
	private void sub() {
	
		System.out.println(++age);
		

	}
	public static void main(String[] args) {
		instancevariable i=new instancevariable();
		i.add();
		i.sub();
		
		System.out.println(++i.age);
		
		
	}

}
