package com.crm.genericUtils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListImpClass implements ITestListener
{
	
	ExtentReports report;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) 
	{
	//Execution start from here
		
		String methodName = result.getMethod().getMethodName();
		test = report.createTest(methodName);
		Reporter.log(methodName+"------->  Execution Start");
		
	}
	
	

	@Override
	public void onTestSuccess(ITestResult result) {
	
		String methodName = result.getMethod().getMethodName();
		test.log(Status.PASS, methodName+"---->Passes");
		Reporter.log(methodName+"---->tetscript executed successfully");
	}
	
	

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		
		try {
			WebDriverUtils driverUtils = new WebDriverUtils();
			//driverUtils.takescreenshot(BaseClass.driver, methodName);
			String screenshotpath = driverUtils.takescreenshot(BaseClass.driver, methodName);
			
			test.log(Status.FAIL, methodName+"---->TestScript.failed");
			test.log(Status.FAIL, result.getThrowable());
			Reporter.log(methodName+"--->Failed");
			test.addScreenCaptureFromPath(screenshotpath);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
		test.log(Status.SKIP, methodName+"---->Skipped");
		test.log(Status.SKIP, result.getThrowable());
        Reporter.log(methodName+"--->Skipped");		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
		ExtentSparkReporter htmlreport = new ExtentSparkReporter("./ExtentReport/report.html");
		htmlreport.config().setDocumentTitle("SDET-54");
		htmlreport.config().setTheme(Theme.STANDARD);
		htmlreport.config().setReportName("VTiger");
		
		ExtentReports report = new ExtentReports();
		              report.attachReporter(htmlreport);
		              report.setSystemInfo("Base platform", "window 10");
		              report.setSystemInfo("Base Browser", "chrome");
		              report.setSystemInfo("Base URL", "http://rmgtestingserver/domain/sales_And_inventory_System/pages/login.php");
		              report.setSystemInfo("Reporter Name", "Vijayalaxmi");
		              
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		report.flush();
	}
	

}
