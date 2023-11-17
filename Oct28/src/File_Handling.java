import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling {

	public static void main(String[] args) {
		File file=new File("/home/dai/Documents/Java/JavaWorkspace/Oct28/pqr.txt");
		try {
			file.createNewFile();
		}catch(IOException e)
		{
			e.printStackTrace();
		}

		System.out.println("file created..");
		try {
		FileWriter fileWriter=new FileWriter(file);
		fileWriter.write("This is first line into the file..");
		fileWriter.close();
		
		}catch(Exception e){
			
		}

		/*
		try {
		char [] s=new char[100];
		FileReader fileReader=new FileReader(file);
		fileReader.read(s);
		System.out.println(s);
		
		}catch(Exception e) {
			
		}
		*/
		try {
			Scanner sc=new Scanner(file);
			while(sc.hasNextLine()) {
				String str = sc.nextLine();
				System.out.println(str);
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
