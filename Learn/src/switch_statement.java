
//switch statement is used while checking multiple conditions with a constant value such as a month number
public class switch_statement {
	
	public static void main(String[] args)
	{
		String monthString = null;
		int month = 4;
		
		switch(month) 
		{
		case 1:
			monthString = "january";
			break;
		case 2:
			monthString = "feb";
			break;
		case 3:
			monthString = "march";
			break;
		case 4:
			monthString = "april";
		    break;
		default:
			System.out.println("invalid");
			break;
			
		}
		System.out.println(monthString);
		
	}
	
}
