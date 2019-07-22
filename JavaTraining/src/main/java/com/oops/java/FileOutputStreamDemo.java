package com.oops.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Personal\\abc.txt");
		FileWriter fs = new FileWriter(file);
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext("[a-zA-Z]+")){
			String a=sc.next();
			fs.write(a);
			System.out.println(a);
		}
		fs.flush();
		fs.close();
	}
}
