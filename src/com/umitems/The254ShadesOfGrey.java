package com.umitems;

/**
 * Created by um2015 on 7/6/2015.
 * http://www.codewars.com/kata/254-shades-of-grey/java
 */
public class The254ShadesOfGrey {

  static String[] main(int num) {
    num = Math.max(0, Math.min(254, num));// filter out unusual num
    String[] result = new String[num];
    for (int i = 1; i <=num; ++i) {
      result[i-1] = String.format("#%02x%02x%02x", i, i, i);
    }
    return result;
  }
}
