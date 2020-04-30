package com.imc;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		String fileName="input.txt";
		FileInputStream in = null;  // throws IOException 
		try {
			in = new FileInputStream(fileName);
			int c ;
			while((c=in.read())!=-1) {
				System.out.print((char)c);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
