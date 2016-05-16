package com.parsing.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadAndWrite {
	public static File FileRead(File fileName) throws Exception {

		File Resume = new File("C:/Users/toshiba/Documents/MyResume.txt");

		try {
			FileReader fileReader = new FileReader(Resume);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + Resume + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + Resume + "'");
		}
		return Resume;
	}
}
