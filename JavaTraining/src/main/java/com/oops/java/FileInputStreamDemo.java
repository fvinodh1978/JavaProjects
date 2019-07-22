package com.oops.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		File file = new File ("C:\\Personal\\abc.txt");
		try {
			FileInputStream fs = new FileInputStream(file);
			int c;
			while (( c = fs.read())!=-1){
				System.out.print((char)c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.print("File Doesnt Exists...");
		}

	}

}
