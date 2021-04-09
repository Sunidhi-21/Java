package com.xworkz.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

	public static void main(String[] args) {

		System.out.println("Writing to file using FileInputStream");
		File file = new File("E:\\FileHandling\\CreateDir\\IOFile\\myFile.txt");

		try {
			FileOutputStream out = new FileOutputStream(file);
			String msg = "Welcome home folks";
			byte[] b = msg.getBytes();
			out.write(b);

			System.out.println("Completed writing into file");
			out.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
