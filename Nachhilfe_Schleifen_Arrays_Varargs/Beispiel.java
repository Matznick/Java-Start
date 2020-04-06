public class Beispiel {
	public static void main(String[] args) {
		int[] werte = {13, 4, 0, 0, 6, 5};
		for (int wert : verschiebeNullen(werte)) {
			System.out.print(wert + " ");
		}
		System.out.println("\nMit Varargs:");
		for (int wert : verschiebeNullenVarargs(13, 4, 0, 0, 6, 5)) {
			System.out.print(wert + " ");
		}
		System.out.println("");
		for (int wert : verschiebeNullenVarargs(7, 0, 5, 0)) {
			System.out.print(wert + " ");
		}
		System.out.println("");
		//Auch Arrays können als Vararg übergeben werden
		for (int wert : verschiebeNullenVarargs(werte)) {
			System.out.print(wert + " ");
		}
	}
	//Methode soll Nullen an das Ende eines übergebenen Arrays verschieben 
	//und dabei die Reihenfolge der übrigen Elemente beibehalten
	public static int[] verschiebeNullen(int[] werte) {
		//Durchlaufen des Arrays
		for (int i = 0; i < werte.length; i++) {
			//Aufsteigen der Nullen
			for (int j = 0; j < werte.length - i - 1; j++) {
				if (werte[j] == 0) {
					werte[j] = werte[j + 1];
					werte[j + 1] = 0;
				}
			}
		}
		return werte;
	}
	//Mit Varargs
	public static int[] verschiebeNullenVarargs(int... werte) {
		//Durchlaufen des Arrays
		for (int i = 0; i < werte.length; i++) {
			//Aufsteigen der Nullen
			for (int j = 0; j < werte.length - i - 1; j++) {
				if (werte[j] == 0) {
					werte[j] = werte[j + 1];
					werte[j + 1] = 0;
				}
			}
		}
		return werte;
	}
}