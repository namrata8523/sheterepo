package com.bank.qa.utilities;



import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.bank.Framework_base.TestBase;

public class WebEventListener extends TestBase implements WebDriverEventListener{
	
	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Before navigate to:" +url + "");
			
		}

		public void afterNavigateTo(String url, WebDriver driver) {
			
			System.out.println("After navigate to ;" +url +"");
		}
		public void beforeChangeValueOf(WebElement element, WebDriver driver) {
			System.out.println("Value of the :"+ element.toString() + "Before any changes made");
			
		}
		public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
			System.out.println("Element value changed to"+element.toString());
			
		}
		public void beforeClickOn(WebElement element, WebDriver driver) {
			System.out.println("Trying to click on" +element.toString());
			
		}

		public void afterClickOn(WebElement element, WebDriver driver) {
		
			System.out.println("Trying to click on " + element.toString());
		}

		public void beforeNavigateBack(WebDriver driver) {
			System.out.println("Navigating back to previous page ");
		}

		public void afterNavigateBack(WebDriver driver) {
			System.out.println("Navigated back to previous page");
			
		}
		public void beforeNavigateForward(WebDriver driver) {
			System.out.println("Navigating forword to next page");
				
			}

			public void afterNavigateForward(WebDriver driver) {
				System.out.println("Navigated forword to next page");
				
			}
			
			public void onException(Throwable error, WebDriver driver) {
				System.out.println("Exception Occured:" + error);
				try {
				Test_Util.takeScreenshotAtEndOfTest();
				}
				catch(Exception e) {
				e.printStackTrace();
				}
			}
			public void beforeFindBy(By by, WebElement element, WebDriver driver) {
				System.out.println("Trying to find Element By: "+ by.toString());
				
			}

			public void afterFindBy(By by, WebElement element, WebDriver driver) {
				System.out.println("Found Element by: "+ by.toString());
				
			}

	public void beforeAlertAccept(WebDriver driver) {
	
		
	}

	public void afterAlertAccept(WebDriver driver) {
	
		
	}

	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	

	
	

	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	


	

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}


	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

}
