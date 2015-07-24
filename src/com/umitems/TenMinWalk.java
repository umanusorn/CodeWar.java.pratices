package com.umitems;

/**
 * Created by um2015 on 7/24/2015.
 * Problem source http://www.codewars.com/kata/take-a-ten-minute-walk/java
 */
public class TenMinWalk {

  public static boolean isValid(char[] walk) {

    final int NUM = 10;
    if (walk.length != NUM)
      return false;
    int x = 0;
    int y = 0;
    for (int i = 0; i < NUM; i++) {

      switch (walk[i]) {
        case 'n':
          y++;
          break;
        case 's':
          y--;
          break;
        case 'e':
          x++;
          break;
        case 'w':
          x--;
          break;

      }

    }

    if (x == 0 && y == 0)
      return true;

    return false;
  }

}
