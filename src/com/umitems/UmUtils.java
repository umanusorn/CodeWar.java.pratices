package com.umitems;
/**
 * Created by um2015 on 7/5/2015.
 */
public
class UmUtils {

public static
String getMethodName ( ) {
	return new Object () { }.getClass ().getEnclosingMethod().getName();
}

public static
String getClassName( ) {
return new Object () { }.getClass ().getName();
}



}
