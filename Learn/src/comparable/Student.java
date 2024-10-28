package comparable;

public class Student implements Comparable<Student>{

	private String name;
	private int rollNo;
	
	public Student(int rollNo, String name) {
		
		this.name = name;
	}
		
		public void setName(String name) {
		this.name= name;
		
	}
		
		public void setRollNo(int rollNo)
		{
			this.rollNo = rollNo; 
		}
		
		
		public String getName() {
			return name;
		}

		@Override
		public int compareTo(Student student) {
			
				return this.rollNo - student.rollNo;
			
		}
		
		
		
}
