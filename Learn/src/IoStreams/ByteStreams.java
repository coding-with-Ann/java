package IoStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//File handling operations

//If we don't know what kind of data the file contains then just use byte streams.
//Here file will be read byte by byte.
public class ByteStreams{
	
	public static void main(String args[]) throws IOException {
		
		FileInputStream inStream= null;
		FileOutputStream outStream = null;
		
		try {
			inStream = new FileInputStream("C:\\java-tutorials\\source.txt");
			outStream = new FileOutputStream("C:\\java-tutorials\\dest.txt");
			//reads a byte at a time, if it is reached end of the file,returns -1
			int content;
			while((content = inStream.read())!= -1) {
				outStream.write((byte)content);
			}
		}finally {                       //to close the file.
			if(inStream != null) {
				inStream.close();
			}
			if(outStream != null) {
				outStream.close();
			}
		}
	}
	
}

	
	