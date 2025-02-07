package com;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadOperation {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//Path path = Paths.get("demo.txt");		// path is ready
		Path path = Paths.get("C:\\Users\\akash\\Desktop\\Maven Plugins.txt");
		
		String result = Files.readString(path);
		System.out.println(result);
	}

}
