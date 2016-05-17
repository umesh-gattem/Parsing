package com.parsing.main;

import java.util.ArrayList;
import java.util.List;

public abstract class Parser {

	public List<String> lines = new ArrayList<>();

	public Parser(List<String> lines) {
		this.lines = lines;
	}

	// This is the Abstract Class
	public abstract Object parse();

}
