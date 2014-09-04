package com.example.eventbussample;

public class TestObject {

	private String name;
	private String email;
	
	public TestObject(String name, String email){
		this.name = name;
		this.email = email;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "TestObject{" +
				"name='" + name + '\'' +
				", email'" + email + '\'' +
				'}';
	}
}
