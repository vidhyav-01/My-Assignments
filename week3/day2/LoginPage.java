package week3.day2;

public class LoginPage extends BasePage {

	public void performCommonTasks() {
		System.out.println("Performing login-specific tasks in LoginPage...");
		super.findElement();
		super.clickElement();
		super.enterText("Welcome");
	}
	
	// Overriding performCommonTasks()
	
	public static void main(String[] args) {
		LoginPage l = new LoginPage();
		l.findElement();
		l.enterText("vidhya");
		l.enterText("Welcome");
		l.clickElement();
		l.performCommonTasks();
	}
}
