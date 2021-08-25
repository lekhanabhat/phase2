package file_application;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Ui_Application u = new Ui_Application("lekhana");
		try {
			u.showMenu();
		} catch (Exception e) {
			System.out.println("Please enter numbers only.... ");
		}
	}

	}


		
