package Classes;

public class Student {
		
		String name;
		int age;
		String address;
		
		public Student(String name , int age ,String address) {
			
			this.name = name;
			this.age = age;
			this.address = address;	
		}
		public void setName(String name)
		{
			this.name = name ;
		}
		public void setAge(int age)
		{
			this.age = age;
		}
		
		public void setAddress( String address) {
			
			this.address = address;
		}
		
		public String getName()
		{
			return name;
		}
		public String getAddress()
		{
			return address;
		}
		
		public int getAge()
		{
		   return age;	
		}
		
		public String toString()
		{
	       return ("student name is "+ this.getName()+ " " + 
		           "age is " + this.getAge() +" " + "address is" + " " + this.getAddress());
		}
		
		public static void main(String[] args)
		{
			Student john = new Student("Ann" , 1 , "England");
			System.out.println(john.toString());
			
		}
	}
