package com;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.nio.file.StandardOpenOption;
public class FileHandling {

	public static void main(String[] args) throws Exception{
		
		Path path = Paths.get("demo.txt");		// path is ready
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data");
		String data = sc.nextLine();
		String breakLineContent = "\n"+data;
		//String data = "Simple File handling example\n Another Information";  // content is ready 
		//Files.writeString(path, data);		data override 
		Files.writeString(path, breakLineContent,StandardOpenOption.APPEND);  // append the data 
		System.out.println("Data stored in file");

	}

}
