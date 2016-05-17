package com.parsing.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReadAndWrite {
	/**
	 * Here is the declaration of File Read . Here whole text document is read
	 * and they are splitted in to individual lines
	 * 
	 * @param fileName
	 * @return
	 * @throws Exception
	 * @author Umesh Kumar Gattem
	 * 
	 */

	public static List<String> fileRead(String fileName) throws Exception {
		BufferedReader br = null;
		List<String> res = new ArrayList<>();
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader(fileName));
			while ((sCurrentLine = br.readLine()) != null) {
				res.add(sCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return res;
	}
}