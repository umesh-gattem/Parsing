package com.parsing.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexForMailId {

	public void getEMailId(File resume) {
		// TODO Auto-generated method stub
		BufferedReader br;

		Pattern patternForEmailId = Pattern.compile("[A-Z0-9_\\W]+@[A-Z0-9.-]+.[A-Z]{2,4}");
		try {

			br = new BufferedReader(new FileReader(resume));
			int lines = 0;
			int flag = 0;

			for (String line = br.readLine(); line != null;line = br.readLine()) {
				lines++;

				Matcher matcher = patternForEmailId.matcher(line.toUpperCase());
				if (matcher.matches()) {
					System.out.println("Email matched in : " + lines + " line: '" + line + "'");
					flag++;
				}
			}
			// output of summary
			if (flag == 0) {
				System.out.println("No matches in " + lines + " lines");
			} else {
				System.out.println("\n" + flag + " matches in " + lines + " lines");
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
