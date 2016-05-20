package com.parsing.main;

import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.parsing.main.EmailIdParser;
import com.parsing.main.Parser;
import com.parsing.main.PhoneNumberParser;
import com.parsing.utility.FileReadAndWrite;

public class MainParsing {
	
	private static  Logger LOGGER = Logger.getLogger(MainParsing.class);

	/**
	 * Here is the declaration of Main Parsing. It takes the File path as a
	 * argument. It creates the Abstract Class Parser and two inheritance class
	 * EmailIdParser and PhoneNumberPrser.
	 * 
	 * It display all EmailId's and Phone No's in the file document as a Output
	 * 
	 * @param a
	 * 
	 * @author Umesh Kumar Gattem
	 */
	public static void main(String a[]) {
	//	PropertyConfigurator.configure("log4j.properties");

		HashMap<String, List<String>> response = new HashMap<>();
		if (a.length < 0) {
			System.out.println("Please pass file name as argument");
			return;
		}

		if (a[0] != null) {
			try {
				
				LOGGER.info("hai hai hai hai");
				
				List<String> lines = FileReadAndWrite.fileRead(a[0]);

				Parser emailParser = new EmailIdParser(lines);

				Parser phoneParser = new PhoneNumberParser(lines);

				List<String> emailId = (List<String>) emailParser.parse();

				response.put("EMAIL ID'S", emailId);

				System.out.println("Email Id's:" + emailId);

				List<String> phoneNo = (List<String>) phoneParser.parse();

				response.put("Phone No'S", phoneNo);

				System.out.println("Phone No's:" + phoneNo);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
