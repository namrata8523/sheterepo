package com.bank.qa.ExtentReportListener;

import java.io.File;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;

public class ExtentReportListener implements IReporter{
	private ExtentReports extent;
	public void generateReport(List<XmlSuite> xmlSuite, List<ISuite> suites, String outputDirectory)
	{
		extent=new ExtentReport(outDirectory + File.separator +"Extent.html , true");
		for(ISuite suite : suites)
		{
			Map<String, ISuiteResult> result = suite.getResults();
			
			for(ISuiteResult r : result.value())
			{
				ITestContext context =r.getTestContext();
				buildTestNodes(context.getPassedTests(),LogStatus.PASS);
				buildTestNodes(context.getPassedTests(),LogStatus.FAIL);
				buildTestNodes(context.getPassedTests(),LogStatus.SKIP);
				
				}
			
		}
		extent.flush();
		extent.close
	}

}
