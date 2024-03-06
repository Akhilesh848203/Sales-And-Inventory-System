package MavenCommand;

import org.testng.annotations.Test;

public class ClassC 
{
	@Test(groups = "smoke")
	public void methodA()
	{
		System.out.println("---MethodA---");
	}

	@Test(groups = "regression")
	public void methodB()
	{
		System.out.println("---MethodB---");
	}

	
	@Test(groups = "integration")
	public void methodC()
	{
		System.out.println("---MethodC---");
	}

	
	
}
