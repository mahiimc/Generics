package com.imc;

import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterExample {
	public static void main(String[] args) {
		PrintWriter p = null;
		try {
		 p= new PrintWriter("output.txt");
		String[] names = {"Mahesh" ,"Maruthi","Vijay","Harish"};
		int [] semNums = {1,2,2,3};
		double [] cgpa = {7.8,9,9.5,9.2};
		
		for(int i=0;i<names.length;i++) {
			p.println(names[i]+"\t"+semNums[i]+"\t"+cgpa[i]);
			System.out.println(names[i]+"\t"+semNums[i]+"\t"+cgpa[i]);
		}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			p.close();
		}
		
	}

}
