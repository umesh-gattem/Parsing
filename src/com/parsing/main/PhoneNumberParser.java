package com.parsing.main;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.parsing.constant.RegexConstant;

public class PhoneNumberParser extends Parser {

	public PhoneNumberParser( List<String> lines )
	{
		super(lines);
	}
	List<String> result = new ArrayList<>();
	/**
	 * Here is the declaration to match the file with the given regex 
	 * 
	 * 
	 */
	@Override
	public Object parse()
	{
		Pattern patternForMobileNo = Pattern.compile(RegexConstant.PHONE_PATTERN);
		for( String line : lines )
		{
			Matcher matcher = patternForMobileNo.matcher(line);
			if( matcher.matches() )
			{
				result.add(line);

			}
		}
		return result;
	}

}