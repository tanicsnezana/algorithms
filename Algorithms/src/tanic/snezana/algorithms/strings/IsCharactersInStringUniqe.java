package tanic.snezana.algorithms.strings;

import java.util.Arrays;

public class IsCharactersInStringUniqe {
	
	// first solution
	public static boolean isUnique(final String str) {
		if(str == null || str.length() == 0) {
			return true;
		}
		
		boolean []allChars = new boolean[256];
		Arrays.fill(allChars, false);
		
		for(char ch : str.toCharArray()) {
			if(allChars[ch]) {
				return false;
			}
			allChars[ch] = true;
		}
		
		return true;
	}

}
