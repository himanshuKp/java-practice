package com.himanshu.String;

import java.util.StringTokenizer;

public class StrTokDemo1 {

	public final static int MAXFIELDS = 5;
	public final static String DELIM = "|";
	
//	process one string, return it as an array of string
	public static String[] process(String line) {
		String[] results = new String[MAXFIELDS];
		
//		unless you ask StringTokenizer to give you the tokens,
//		it silently discards multiple null tokens.
		StringTokenizer st = new StringTokenizer(line,DELIM,true);
		
		int i = 0;
		
//		stuff each token into the current slot in the array
		while (st.hasMoreTokens()) {
			String s = st.nextToken();
			if(s.equals(DELIM)) {
				if(i++>=MAXFIELDS)
					throw new IllegalArgumentException("Input line "
							+line+" has too many fields.");
					continue;
			}
			results[i] = s;
		}
		return results;
	}
	
	private static void printResults(String input, String[] output) {
		System.out.println("Input: "+input);
		int i = 1;
		for(String s:output) {
			System.out.println("Output " +i+ " was: " +s);
			i++;
		}
	}
	
	public static void main(String[] args) {
		
		printResults("A|B|C|D",process("A|B|C|D"));
		printResults("A||C|D",process("A||C|D"));
		printResults("A|||C|D",process("A|||D|E"));
	}

}
