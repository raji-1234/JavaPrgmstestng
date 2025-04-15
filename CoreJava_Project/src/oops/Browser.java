package oops;

public abstract  class Browser {
	public void LaunchBrowser() {

		System.out.println("Launching the browser");
	}

	public void OpenApplication(String application) {

		System.out.println("Opening the application");
	}
public abstract void CloseBrowser();
public void DispalyData() {
	System.out.println("Display the data");
}
}
