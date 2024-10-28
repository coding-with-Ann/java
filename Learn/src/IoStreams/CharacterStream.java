package IoStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//If we work on files which is holding characters then use character stream.
//Character stream also internally using byte stream only.
//file will be read character by character.
public class CharacterStream {
	
public static void main(String args[]) throws IOException {
		
		FileReader reader= null;
		FileWriter writer = null;
		try {
		reader = new FileReader("C:\\java-tutorials\\source.txt");
		writer = new FileWriter("C:\\java-tutorials\\dest.txt");
		//Reading source file and writing content to the target file character by character.
		int content;
		while((content = reader.read())!= -1) {
			writer.append((char)content);
		}
	}finally {
		if(reader != null) {
			reader.close();
		}
		if(writer != null) {
			writer.close();
		}
	}

  }
}
