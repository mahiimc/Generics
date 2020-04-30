package com.imc;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterInputStreamReaderExample{
	public static void main(String[] args) throws IOException {
		InputStreamReader input = null;
		try {
			input = new FileReader("input.txt");
			int c ;
			while((c=input.read())!=-1) { //EOF
				System.out.print((char)c);
			}
		}
		finally {
			if(input !=null) {
				input.close();
			}
		}
		
		
	}

}
