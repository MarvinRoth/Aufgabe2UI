
import java.util.Scanner;

public class SachbearbeiterHS {
	Scanner eingabe = new Scanner(System.in);	
	//private LoginAAS login = new LoginAAS();
	private AdminSachbearbeiterAS adminarbeiter = new AdminSachbearbeiterAS();
	private NormalSachbearbeiterAS normalarbeiter = new NormalSachbearbeiterAS();
	public void oeffnen(){
		int input;
		while(true){
			System.out.println("F�r Login die 1 dr�cken");
			System.out.println("F�r Beenden die 0 dr�cken");
			System.out.println("Eingabe: ");
			input = eingabe.nextInt();
			switch(input) {
			case 0:
				System.exit(0);
				break;
			case 1:
				//login.oeffnen();
				break;
			default:
				System.exit(0);
			}
			
		}
	}
	

}

