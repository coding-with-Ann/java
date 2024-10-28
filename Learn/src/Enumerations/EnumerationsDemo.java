package Enumerations;

//When we create an application we will face scenarios where we have to create variables which will remain constants forever.
//Months of an year, name of flowers are constants, name of the seasons will always remains same.
//You can think these names as constants, they will never change.
//Enum is used to define type safe variables.
//When we say type safe variables it means they are not integers or string they are enum type.
//These are by default constants and you can't change them.
//

public enum EnumerationsDemo {
	
    Red("red"), blue("blue"), white("white");
	
	private String value;
	
	EnumerationsDemo(String value)
	{
		this.value = value;
	}
	public String getValue()
	{
		return value;
	}
	 
}

