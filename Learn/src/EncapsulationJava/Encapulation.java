package EncapsulationJava;
//Encapsulation is used to restrict the properties a class to the outside world.
//First make the properties of the class as private. So only the class can access the properties. No outside world can access it. 
//Basic idea is encapsulate objects.
// Setters are used to overwrite getters are used to access the properties.
public class Encapulation {
	
	private String name;
	private String address;
	private int age;
	
	public void Encapsulation(String name, String address, int age)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(Integer age)
	{
		this.age = age;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getName(String name)
	{
		return name;
	}
	public int getAge(int age)
	{
		return age;
	}
	public String getAddress(String address)
	{
		return address;
	}
	
	public String toString()
	{
		return ("Student name is " +this.name+ "age is " +this.age + "address is" + this.address);
	}
	
	public static void main(String[] args)
	{
		Encapulation student = new Encapulation();
		System.out.println(student.getName("Ann"));
		System.out.println(student.getAge(1));
		System.out.println(student.getAddress("England"));
		System.out.println(student.toString());
		
	}
	
	
	

}
