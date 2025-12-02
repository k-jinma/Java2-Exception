package lesson75;

import java.io.File;
import java.util.Scanner;



public class Program2 {

	public static void main(String[] args) {

		
		String fileName = "data.txt";
		fileOpen(fileName);
		
	}
	
	public static void fileOpen(String fileName) {
		
		File file = new File(fileName);
		
		// FileNotFoundException発生の可能性あり
		Scanner scanner = new Scanner(file); 
		
	}
}
