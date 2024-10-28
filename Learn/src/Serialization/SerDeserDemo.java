package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
                                            //didn't execute.
public class SerDeserDemo {
	
	public static void main(String args[]) {
		
		Student student = new Student("john",10,"California");
		student.setX(10);
		
		String filename = "F:\\java_Tutorials\\test.txt";
		FileOutputStream fileOut = null;
		ObjectOutputStream objOut = null;
		//Serialization
		try {
			fileOut = new FileOutputStream(filename);
			objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(student); //used to write student object into the file. It is automatically going to serialize.
			                             //This is the only way java can write object into the file.
			
			objOut.close();
			fileOut.close();
			
			//If you have a use case where you have a property in a student class or in your object but you don't want to serialize it.
			//Lets say we have many different properties inside the student class and you don't want to serialize that value or don't want the consumer app to see it. 
			//In that case we can use transient variable.
			
			System.out.println("Object hasbeen Serialized:\n" + student);
			
		}catch(IOException ex){
			System.out.println("IOException is caught");
			
		}
		//Deserialization
		
		FileInputStream fileIn = null;
		ObjectInputStream objIn = null;
		
		try {
			fileIn = new FileInputStream(filename);
			objIn = new ObjectInputStream(fileIn); //to read the object
			
			Student object = (Student) objIn.readObject();
			
			//readObject method returns an object. readObject method doesn't know it is a student object method.
			//So we have to explicitly cast it to student type so that you can store this as a student object.
			// because When you serialize an object the class type information is lost.
			
			System.out.println("Object has been deserialized: \n" + object);
			System.out.println("The deserialized value of x is " + object.getX());
			objIn.close();
			fileIn.close();
			
		}catch(IOException ex) {
			System.out.println("IO exception is caught");
		}catch(ClassNotFoundException ex) {
			System.out.println("Class not found exception" + "is caught");
		}
		
	}

}
