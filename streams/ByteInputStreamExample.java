package com.xworkz.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteInputStreamExample {

	public static void main(String[] args) {
		
		System.out.println("Write into file using ByteInputStream");
		File file = new File("E:\\\\FileHandling\\\\CreateDir\\\\IOFile\\\\myFile.txt");
		
		try {
			FileInputStream in = new FileInputStream(file);
			
			byte inputmsg[] = new byte[20];
			in.read(inputmsg);
			
			for(byte b : inputmsg) {
				System.out.println((char)b);
			}
			
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
				e.printStackTrace();
		}
		
	}

}
