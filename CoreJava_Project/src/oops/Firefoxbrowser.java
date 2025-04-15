package oops;

public class Firefoxbrowser extends Browser {
	@Override
	public void LaunchBrowser() {

		System.out.println("Launching the firefox browser");
	}
	
	// This is not overridden method
	//@Override
	public void OpenApplication(String application) {
		
		System.out.println("Opening the application in Firefox browser");
	}

	@Override
	public void CloseBrowser() {
		// TODO Auto-generated method stub
		System.out.println("Closing the application in firefox browser");

	}

}
