import javax.swing.*;
import java.util.Scanner;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.ActionEvent;


public class LoginAAS{
	
    private static LoginAAS singleInstance = new LoginAAS();
    private LoginK kontrolle;
    static boolean berechtigung_login;
    static String name_login;
    public JPanel panel;
    
    //Konstruktor
	private LoginAAS() {
		kontrolle = new LoginK();
	}
	
	public static LoginAAS getInstance() {
		if(singleInstance== null) {
			singleInstance = new LoginAAS();
			return singleInstance;
		}
			else return singleInstance;
		}
	
	public JPanel login() {
		panel = new SachbearbeiterS().konfiguriereSachbearbeiterPanel(
	                "Login", "Benutzername", "Passwort", true);
		return panel;
		/*boolean admin = false;
		String bName, passwort;
		while(true) {
			bName = eingabe.nextLine();
			passwort = eingabe.nextLine();
			SachbearbeiterEK arbeiter = kontrolle.pruefeLogin(bName, passwort, admin);
			if (!(arbeiter == null)) {
				if (arbeiter.admin && admin)
					AdminSachbearbeiterAS.oeffne(arbeiter);
				else
					NormalSachbearbeiterAS.oeffne(arbeiter);
		}
		*/
	}
	void praesentiereEK() {
		
	}
	void selektiereEK() {
		
	}
	void modifiziereEK() {
		
	}
	static void oeffnen() {


	}
	void schliessen() {
		
	}
	void abbrechen() {
		System.out.println("");
	}
	void ausgefuehrt() {
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
