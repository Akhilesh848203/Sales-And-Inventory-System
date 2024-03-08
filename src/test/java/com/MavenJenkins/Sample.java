package com.MavenJenkins;

import org.testng.annotations.Test;

public class Sample 
{
	
	@Test(groups = "smoke")
	public void sampleA()
	{
		System.out.println("----sampleA----");
	}
	
	@Test(groups = "smoke")
	public void sampleB()
	{
		System.out.println("----sampleB----");
		
	}
	
	@Test(groups = "regression")
	public void sampleC()
	{
		System.out.println("----sampleC----");
	}
	
	@Test(groups = "integration")
	public void sampleD()
	{
	  System.out.println("----sampleD----");	
	}

	
}
