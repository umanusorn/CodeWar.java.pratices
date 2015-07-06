package com.umitems;
/**
 * Created by um2015 on 7/5/2015.
 */
public
class VowelCount {
	public static int main(String str) {
		int vowelsCount = 0;

		for(int i=0;i<str.length();i++)
			if(isVowel(str.charAt(i)))
				vowelsCount++;

		return vowelsCount;
	}



	public static boolean isVowel(char unKnownChar){
		switch(unKnownChar){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':return true;
		}
		return false;

	}
}
