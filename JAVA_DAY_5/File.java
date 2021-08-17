package com.sonata.file;

import java.io.FileInputStream;

public class File {

		public synchronized static void main(String[] args) {
			try {
				FileInputStream file = new FileInputStream("C:/test.txt");
			}catch(Exception e) {
				System.out.println("File not Found");
			}
			finally {
				System.out.println("Executed the program");
		}

	}

}


