package com.niit.basicdemos;

public class DriverClass {
	
	public static void main(String[] args) {
		
		Address a1Address = new Address();
		a1Address.setCity("Mumbai");
		a1Address.setStreet("station road");
		
		Employee a1 = new Employee();
		a1.setAddress(a1Address);
		
		a1.setEid(1);
		a1.setEname("John");
		
		System.out.println(a1.getAddress().getCity());
	}

}
