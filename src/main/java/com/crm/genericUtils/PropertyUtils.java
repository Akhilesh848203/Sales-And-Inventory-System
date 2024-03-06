package com.crm.genericUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils
{
	public String readDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(IpathConstants.propertyfilePath);
		Properties p = new Properties();
		
		p.load(fis);
		String value = p.getProperty(key);
		return value;
				
	}

}
