package com.Anderson.homework3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.File;
import java.util.Scanner;

public class CharacterChecker {
	
	public static void main(String[] args) throws IOException
	
	{
		char check = '\0';
		int count = 0;
		Scanner in = new Scanner(System.in);
		if(args.length > 0) 
		{
			check = args[0].toCharArray()[0];
		}
		else
		{
			System.out.println("Enter a character you want to scan for");
			String holder = in.next();
			check = holder.charAt(0);
		}

		System.out.println("Enter the name of the file you want to read");
		File file = new File(in.next());
		try {
			FileInputStream fs = new FileInputStream(file);
			while(fs.available()>0)
			{
				if(check == (char) fs.read())
				{
					count++;
				}
			}
		System.out.println("The character " + check + " appeared " + count + " times in file " + file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
