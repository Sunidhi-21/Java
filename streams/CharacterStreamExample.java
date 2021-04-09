package com.xworkz.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharacterStreamExample {

	public static void main(String[] args) {
		System.out.println("Reading from file");
		File file = new File("E:\\\\FileHandling\\\\CreateDir\\\\IOFile\\\\myCharFile.txt");
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
			
			char[] readChars = new char[30];
			fileReader.read(readChars);
			
			for(char c : readChars) {
				System.out.println(c);
			}
			
			System.out.println("Reading dynamically");
			int i=0;
			while((i=fileReader.read())!=-1){
				System.out.println((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fileReader!=null)
					fileReader.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
