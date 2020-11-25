

import java.util.HashSet;

public class FortbildungEK {
	private static HashSet<FortbildungEK> fortbildungen = new HashSet<FortbildungEK>();
	private String name;
	private String datum;
	public FortbildungEK gibKopie(String name) {
		for (FortbildungEK e : fortbildungen) {
			if (e.name.equals(name))
				return new FortbildungEK(e.name, e.datum);
		}
		return null;
	}
	public FortbildungEK gib(String name) {
		for (FortbildungEK e : fortbildungen) {
			if (e.name.equals(name))
				return e;
		}
		return null;
	}
	public FortbildungEK(String name, String datum) {
		this.name = name;
		this.datum = datum;
		fortbildungen.add(this);
	}
}
