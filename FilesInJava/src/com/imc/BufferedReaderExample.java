package com.imc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class BufferedReaderExample {
	public static void main(String[] args) throws IOException {
		String filename="input.txt";
		BufferedReader bf = new BufferedReader(new FileReader(filename));
		String currentLine;
		while((currentLine = bf.readLine())!= null) {
			System.out.println(currentLine);
		}
	}

}
