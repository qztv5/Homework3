package com.Anderson.homework3;

import java.io.File;
import java.util.Scanner;

public class FileLister {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a directory where you would like so see all files and dircectories");
		File folder = new File(in.next());
		String[] files = folder.list();
		
		for(String file: files)
		{
			System.out.println(file);
		}
	}
}
