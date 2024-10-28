package Classes;
//In a use case where some of the properties are mandatory and some are not.
// we can create multiple constructors to do this.
/*If no constructor is provided java uses default constructor with no parameters 
  and default values are set to the properties so output will be 0 for integer.*/

public class Constructors {
	
	int length;
	int width;
	int height;
	
    void cuboid (int length, int width, int height){
		
		this.length = length;
		this.width = width;
		this.height = height;
		
	}
    
    void cuboid (int length, int width)
    {
    	this.length = length;
    	this.width = width;
    	this.height = 10;
    }
    
	void cuboid(int dimension)
	{
		this.length = dimension;
		this.width = dimension;
		this.height = dimension;
	}
	
	void cuboid()
	{
		this.length = 10;
		this.width = 10;
		this.height = 10;
	}
	
	int volume()
	{
		return length * width * height;
	}
		
		
		public static void main(String [] args) {
			
			Constructors vol = new Constructors();
			vol.cuboid(2, 3 , 2);
			System.out.println("value with three arguments is " + vol.volume());
			vol.cuboid(2,3);
			System.out.println("value with two arguments is " +vol.volume());
			vol.cuboid(8);
			System.out.println("value with one argument is " + vol.volume());
			vol.cuboid();
			System.out.println("value with no arguments is " + vol.volume());
			
		}
		
		

}
