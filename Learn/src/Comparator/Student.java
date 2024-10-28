package Comparator;

public class Student {
		
		private String name;
		private int rollNo;
		private int age;
		
		public Student(String name, int rollNo, int age) {
			
			this.name = name;
			this.age = age;
			this.rollNo = rollNo;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(int age)
		{
			this.age = age;
		}
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public int getRollNo() {
			return rollNo;
		}
}
