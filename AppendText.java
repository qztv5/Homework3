package com.Anderson.homework3;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AppendText {

	public static void main(String[] args)
	{
		
		try (FileWriter file = new FileWriter("Test.txt", true))
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter some text you would like to append to a file");
			file.write(in.nextLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
