package ClassObject;

public class Student {
		
		private String name;
		private int age;
		private String address;
		
		public Student(String name , int age ,String address) {
			
			this.name = name;
			this.age = age;
			this.address = address;		
		}
		
		
		
		@Override  //overriding the equals method.
		public boolean equals(Object obj)  
		//equals method contract looks like this where you supply an object which is a foreign object.
		{
			if(this == obj)
				return true;
			// comparing the foreign object with the current object of the student class.
			if(obj == null || obj.getClass()!= this.getClass()) //getClass is a method which tells you the class type.If the class of the obj and this doesn't match then it returns false.
				return false;
			//If object is null or the obj.getclass not equals to this.getClass then it returns false.
			//Here we are checking the obj class object is of type student or not. 
			
			Student student = (Student)obj;  //obj object is explicitly casted into student type.
			
			return (student.age == this.age); 
			//*****Used to identify unique student based on age.
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
