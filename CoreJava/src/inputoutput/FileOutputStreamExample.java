package inputoutput;
import java.io.*;
public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("E:\\mahesh.txt");
		String s="Selenium is an automation tool!";
		
		//convert the text into  a bytestream...
		byte b[]=s.getBytes();
		//push the bytestream into the file...
		fout.write(b);
		//close the filestream..
		fout.close();
	}

}
