package Serialization;

import java.io.Serializable;

public class Student implements Serializable {
	//The moment we use serializable, all the modern IDEs will ask you to add a serialVersionUID.
	//This is added so that java can uniquely identify your object once it is serialized and deserialized.
	//Its like a security feature. Initially the value is one and as you mutate the object the count increases before deserializing it.
	//
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	private String address;
	
	transient int x; //In SerDeserDemo
	
	// If we don't want to serialize and deserialize x then we can use the transient keyword.
	
	public Student(String name,int age, String address) {
		
		this.name = name;
		this.age = age;
		this.address = address;

}
	public void setName(String name) {
		this.name = name;
	}
	public void Setage(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public int getX() {
		return x;
	}
	
	@Override
	public String toString() {
		return ("Student name is "+ this.getName() + 
				 "age is "+ this.getAge() + "and address is "+ this.getAddress());
				
	}
	
}
	
