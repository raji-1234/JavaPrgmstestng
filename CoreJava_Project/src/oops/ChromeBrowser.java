package oops;

public class ChromeBrowser extends Browser {
	@Override
	public void LaunchBrowser() {

		System.out.println("Launching the chrome browser");
	}

	@Override
	public void OpenApplication(String app) {

		System.out.println("Opening the application in chrome browser");
	}
	@Override
	public void CloseBrowser() {

		System.out.println("Closing the application in chrome browser");
	}

}
