package com.example.emailchecker;

public class Validator {
	public static boolean validateEmail(String email){
		boolean result = false;
		
		boolean atSign = (countMatches(email, '@') == 1);
		boolean periods = (countMatches(email, '.') >= 1);
		
		//Custom rule: email address must not start with an '@'
		boolean noLeadingAt = (email.charAt(0) != '@');
		
		//Custom rule: email address must end in '.com' or '.ca'
		boolean validExt = (email.endsWith(".com")) || (email.endsWith(".ca"));
		
		result = atSign && periods && noLeadingAt && validExt;
		return result;
	}
	
	private static int countMatches(String str, char match){
		int result = 0;
		
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == match){
				result++;
			}
		}
		
		return result;
	}
}
