
import java.util.Scanner;

public class AdminSachbearbeiterAS {
	private AdminSachbearbeiterK kontrollklasse;
	public static void oeffne(SachbearbeiterEK arbeiter) {
		int input;
		Scanner eingabe = new Scanner(System.in);
		while(true) {
			System.out.println("Willkommen " + arbeiter.name + "!");
			System.out.println("Bitte Option wählen: ");
			System.out.println("Sachbearbeiter erstellen = 1");
			System.out.println("Sachbearbeiter editieren = 2");
			System.out.println("Logout = 3");
			input = eingabe.nextInt();
			switch(input) {
			case 1:
				AdminSachbearbeiterErstellenAAS erstellen  = new AdminSachbearbeiterErstellenAAS();
				erstellen.oeffne();
				break;
			case 2:
				break;
			case 3: 
				return;
			}
		}
	}

}
