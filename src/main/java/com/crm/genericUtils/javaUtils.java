package com.crm.genericUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class javaUtils 
{
	/**
	 * this method used th generate random number
	 * @return
	 */
	public int getRandomNumber()
	{
		
		Random ran = new Random();
		int random =ran.nextInt(1000);
		return random;
		
	}
	/**
	 * this method is used to capture system date and time
	 * @return
	 */
	public String getSystemDate()
	{
		Date dt = new Date();
		String date = dt.toString();
		return date;
		
	}
	/**
	 * this method is used to convert system date time formate to other date time formate
	 * @return
	 */
	public String getSystemDateInFormat()
	{
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy HH-MM-SS");
		Date dt = new Date();
		String date = dateformat.format(dt);
		return date;
	}

}
