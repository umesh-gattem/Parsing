package com.parsing.main;

import java.io.*;
import com.parsing.utility.FileReadAndWrite;

public class MainParsing {

	@SuppressWarnings("null")
	public static void main(String args[]) {
		
		
		try {
			File file = null;
			File Resume=FileReadAndWrite.FileRead(file);
			RegexForMailId  regexForEmailId=new RegexForMailId();
			regexForEmailId.getEMailId(Resume);
			RegexForMobileNo regexForMobileNo=new RegexForMobileNo();
			regexForMobileNo.getMobileNo(Resume);
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}