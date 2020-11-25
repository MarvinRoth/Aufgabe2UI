
import java.util.HashMap;
import java.util.HashSet;

public class SachbearbeiterEK {
	String name;
	boolean admin = false;
	String passwort;
	HashSet<FortbildungEK> fortbildungen = new HashSet<FortbildungEK>();
	public static HashMap<String,SachbearbeiterEK> storage = new HashMap<String, SachbearbeiterEK>();
	public SachbearbeiterEK(String name, boolean admin, String passwort) {
		this.name = name;
		this.admin = admin;
		this.passwort = passwort;
		storage.put(name, this);
	}
	static String[] gibAlleNamen() {
		String[] array = new String[storage.size()];
		return array;
	}
	static SachbearbeiterEK gibKopie(String name) {
		SachbearbeiterEK kopie = storage.get(name);
		return kopie;
	}
	static SachbearbeiterEK gib(String name) {
		return storage.get(name);
	}
	SachbearbeiterEK kopiereAttribute(SachbearbeiterEK instanz) {
		//In der Form hier nicht implementierbar, da Name Schlüssel ist 
		return null;
	}
}
