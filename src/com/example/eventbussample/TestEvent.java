package com.example.eventbussample;

public class TestEvent {

	private TestObject mTestObject;

	public TestEvent(TestObject testObject){
		this.mTestObject = testObject;
	}
	
	public TestObject getTestObject(){
		return mTestObject;
	}
}
