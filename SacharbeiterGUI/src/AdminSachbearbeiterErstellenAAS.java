import java.util.Scanner;
public class AdminSachbearbeiterErstellenAAS {
	AdminSachbearbeiterErstellenK kontrollklasse  = new AdminSachbearbeiterErstellenK();
	void oeffne() {
		Scanner eingabe = new Scanner(System.in);
		int input;
		System.out.println("-----Willkommen bei der Sachbearbeitererstellung-----");
		System.out.println("Zum Erstellen eines Sacharbeiters die 1 drücken");
		System.out.println("Zum Abbrechen die 2 drücken");
		System.out.print("Eingabe: ");
		input = eingabe.nextInt();
		eingabe.nextLine();
		switch(input) {
		case 1:
			String name, passwort;
			boolean admin;
			System.out.print("Bitte Namen eingeben: ");
			name = eingabe.nextLine();
			System.out.println("Bitte Passwort eingeben: ");
			passwort = eingabe.nextLine();
			System.out.println("Admin? true|false");
			admin = eingabe.hasNextBoolean();
			SachbearbeiterEK.storage.put(name, (new SachbearbeiterEK(name, admin, passwort)));
			break;
		case 2:
			return;
		}
	}
}
