package utils;

import java.util.Date;

public class CurrentDateutil {
	public static String getCurrentDate()
	{
		Date d= new Date();
		return d.toString().replace(":", "_");
	}

}
