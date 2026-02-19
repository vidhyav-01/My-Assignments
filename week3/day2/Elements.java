package week3.day2;

public class Elements extends Button {

	public static void main(String[] args) {
		WebElement we = new WebElement();
		//Using Webelement class
				we.click();
				we.setText("Hi");
        //Using Button Class
		Button Be = new Button();
		Be.click();
		Be.setText("Hello");
		Be.submit();
       //Using Text field class
		TextField Te = new TextField();
		Te.click();
		Te.gettext("Welcome");
	   //Using checkboxButtonclass
		CheckBoxButton ch = new CheckBoxButton();
		ch.click();
		ch.clickCheckButton();
		// Using Radio Button Class
		RadioButton ra = new RadioButton();
		ra.click();
		ra.selectRadioButto();
		//Using Elements
		Elements el = new Elements();
		el.click();
		el.submit();
		System.out.println("Execution elements are working ");
		
		
	
	}
	

}
