/*
 * This version of the ShowFile program uses a try-with-resources statement to automatically close a file under it is no longer needed.
 */
package me.Jackson.JavaExamples2;

import java.io.*;

public class ShowFile2 {

	public static void main(String[] args) throws IOException {
		int i;
		
		//First, confirm that a filename has been specified.
		if(args.length != 1) {
			System.out.println("Usage: ShowFile filename");
			return;
		}
		/*
		 * The following code uses a try-with-resourcse statement to open a file and then automatically close it when the try block is left.
		 */
		try(FileInputStream fin = new FileInputStream(args[0])) {
			
			do {
				i = fin.read();
				if(i != -1) System.out.println((char) i);
			} while (i != -1);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("An I/O Error Occurred");;
		}
	}

}
