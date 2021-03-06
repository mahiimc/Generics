package com.imc;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamReaderExample {

	public static void main(String[] args) throws IOException {
		String fileName="input.txt";
		FileInputStream in = null;  //  ByteStrean && Root class : Input Stream
		try {
			in = new FileInputStream(fileName);
			int c ;
			while((c=in.read())!=-1) { // End of File   and read() -> Reads a byte of the data from input stream
				System.out.print((char)c);
			}
		}
		finally {
			if(in != null ) {
			in.close();
			}
			
		}
	}
}
