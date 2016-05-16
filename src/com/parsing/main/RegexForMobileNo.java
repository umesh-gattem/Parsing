package com.parsing.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexForMobileNo {

	public void getMobileNo(File resume) {
		// TODO Auto-generated method stub
		BufferedReader br;

		Pattern patternForMobileNo = Pattern.compile("^(\\+\\d{1,3}[- ]?)?\\d{10}$");
		try {

			br = new BufferedReader(new FileReader(resume));
			int lines = 0;
			int flag = 0;

			for (String line = br.readLine(); line != null;line = br.readLine()) {
				lines++;

				Matcher matcher = patternForMobileNo.matcher(line);
				if (matcher.matches()) {
					System.out.println("\nMobile nuber  matched in : " + lines + " line: '" + line + "'");
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
