package com.parsing.main;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.parsing.constant.RegexConstant;

public class EmailIdParser extends Parser {

	public EmailIdParser( List<String> lines )
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
		Pattern patternForEmailId = Pattern.compile(RegexConstant.EMAIL_PATTERN);
		for( String line : lines )
		{
			Matcher matcher = patternForEmailId.matcher(line.toUpperCase());
			if( matcher.matches() )
			{
				result.add(line);

			}
		}
		return result;
	}

}
