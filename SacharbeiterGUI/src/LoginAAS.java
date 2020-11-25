import javax.swing.*;
import java.util.Scanner;


public class LoginAAS extends JFrame{
	private LoginK kontrollklasse = new LoginK();
	private Scanner eingabe = new Scanner(System.in);

	public LoginAAS() {
		
	}
	void praesentiereEKNamen() {
		
	}
	void praesentiereEK() {
		
	}
	void selektiereEK() {
		
	}
	void modifiziereEK() {
		
	}
	void oeffnen() {
		boolean admin = false;
		String name, passwort;
		while(true) {
			System.out.println("Bitte Namen eingeben: ");
			name = eingabe.nextLine();
			System.out.println("Bitte Passwort eingeben: ");
			passwort = eingabe.nextLine();
			eingabe.nextLine();
			SachbearbeiterEK arbeiter = kontrollklasse.pruefeLogin(name, passwort, admin);
			if (!(arbeiter == null)) {
				if (arbeiter.admin && admin)
					AdminSachbearbeiterAS.oeffne(arbeiter);
				else
					NormalSachbearbeiterAS.oeffne(arbeiter);
			}
			return;
		}

	}
	void schliessen() {
		
	}
	void abbrechen() {
		System.out.println("");
	}
	void ausgefuehrt() {
		
	}
}
