package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import constants.ApplicationConstants;

public class ReadProperty  implements ApplicationConstants{

	public static String getProperty (String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propertypath);
		Properties p = new Properties();
		p.load(fis);
		String value= p.getProperty(key);
		return value;
		
	} 

}

