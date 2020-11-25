

public class LoginK {
	public SachbearbeiterEK pruefeLogin(String name, String passwort, boolean admin){
		try {
			if (!(SachbearbeiterEK.storage.get(name).name.equals(name) && SachbearbeiterEK.storage.get(name).passwort.equals(passwort))) {
				System.out.println("Ungültiger Login");
				return null;
			}
			return SachbearbeiterEK.storage.get(name);
		}
		catch(Exception e) {
			System.out.println("Ungültiger Login");
			return null;
		}
	}
}
