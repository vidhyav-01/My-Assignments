package week3.day2;

public class LoginTestdata extends TestData{
//Method 1	
public void enterUsername() {
		System.out.println("Enter the Username-->subclass");
	} 
//Method 2	
public void enterPassword(){
	System.out.println("Enter the password-->subclass");
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
	LoginTestdata t = new LoginTestdata();
t.enterCredentials();
t.navigateToHomePage();
t.enterUsername();
t.enterPassword();

	
}


}
