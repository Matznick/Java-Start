public class Produkt {
	private String name;
	private int menge;
	private int kritischeMenge;
	//Konstruktor
	public Produkt(String name, int menge, int kritischeMenge) {
		this.name = name;
		this.menge = menge;
		this.kritischeMenge = kritischeMenge;
	}
	
	//liefert true zurück wenn menge <= kritischeMenge, sonst false
	public boolean kritischeMengeErreicht() {
		return this.menge <= this.kritischeMenge;
	}
	//erhöht die Menge des Produktes
	public void erhoeheMenge(int menge) {
		this.menge += menge;
	}
	
	//Stringrepräsentation des Objektes
	public String toString() {
		return "Name: " + this.name + " Menge: " + this.menge + " Kritisch: " + this.kritischeMenge;
	}
	//Gibt den Namen des Produktes zurück
	public String getName() {
			return this.name;
	}
}