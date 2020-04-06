/*
	Kuehlschrank
		-addProdukt(Produkt, Anzahl)
		-printEinkaufsliste()
		-toString()
	Produkt
		-kritischeMengeErreicht()
		-toString()
*/
public class Kuehlschrank {
	//Produkte, die im Kühlschrank sind
	private Produkt[] produkte = new Produkt[50];
	
	//Konstruktor
	public Kuehlschrank() {
		
	}
	
	public static void main(String[] args) {
		//Erstellen unseres Kühlschranks
		Kuehlschrank unserKuehlschrank = new Kuehlschrank();
		//Erstellen der Produkte
		Produkt fleisch = new Produkt("Fleisch", 4, 1);
		Produkt kaese = new Produkt("Kaese", 6, 2);
		Produkt tomaten = new Produkt("Tomaten", 2, 2);
		Produkt fleisch2 = new Produkt("Fleisch", 4, 1);
		//Produkte dem Kühlschrank hinzufügen
		unserKuehlschrank.addProdukt(fleisch, 4);
		unserKuehlschrank.addProdukt(kaese, 4);
		unserKuehlschrank.addProdukt(tomaten, 4);
		unserKuehlschrank.addProdukt(fleisch2, 4);
		//Kühlschrank ausgeben
		System.out.println(unserKuehlschrank);
		//Einkaufsliste ausgeben
		System.out.print(unserKuehlschrank.printEinkaufsliste());
		
	}
	
	public void addProdukt(Produkt neuesProdukt, int anzahl) {
		//ist neues Produkt ungleich null
		if (neuesProdukt != null) {
			//gehe alle Produkte des Kühlschranks durch
			for (Produkt produkt : this.produkte) {
				//ist an der Stelle im Kühlschrank auch wirklich ein Produkt
				if (produkt != null) {
					//Ist mein neues Produkt schon im Kühlschrank vorhanden
					if (neuesProdukt.getName().equals(produkt.getName())) {
						//Wenn vorhanden, erhöhe Menge des vorhandenen Produktes
						produkt.erhoeheMenge(anzahl);
						return;
					}
				}
			}
			//Hier sind wir wenn das Produkt nicht im Kühlschrank vorhanden ist
			for (int i = 0; i < produkte.length; i++) {
				//Wenn wir einen freien Platz im Kühlschrank finden füge Produkt hinzu
				if (produkte[i] == null) {
					produkte[i] = neuesProdukt;
					return;
				}
			}
			//Dynamisch Speicher vergrößern
		}
	}
	//Einkaufsliste fügt ein Produkt der Liste hinzu, wenn kritische Menge
	//erreicht oder unterschritten ist
	public String printEinkaufsliste() {
		//StringBuilder ist veränderbar im Gegensatz zum String
		StringBuilder einkaufsListe = new StringBuilder();
		for (Produkt produkt : this.produkte) {
			if (produkt != null && produkt.kritischeMengeErreicht()) {
				//hängt String an das Ende des StringBuilder an
				einkaufsListe.append(produkt);
				einkaufsListe.append("\n");
			}
		}
		return einkaufsListe.toString();
	}
	//Stringrepräsentation unseres Kühlschrankes
	public String toString() {
		String ausgabe = "";
		for (Produkt produkt : this.produkte) {
			if (produkt != null) {
				//Ruft die Stringrepräsentation der Produkte auf und added sie der Ausgabe
				ausgabe += produkt + "\n";
			}
		}
		return ausgabe;
	}
}