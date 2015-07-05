package com.umitems;
/**
 * Created by um2015 on 7/5/2015.
 */
public
class VowelCount {

	public static int main(String str) {
		return str.replaceAll("(?i)[^aeiou]", "").length();
	}

}
