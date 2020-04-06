public class Nachhilfe {
	public static void main(String[] args) {
		int[] werte = {1, 34, -7, 15};
		//Standart for-Schleife, die jeden Wert des werte Arrays ausgibt
		for(int i = 0; i < werte.length; i++) {
			System.out.println(werte[i]);	
		}
		System.out.println();
		//for-each-Schleife, die jeden Wert des werte Arrays ausgibt
		//Erleichtert uns das Lesen als Standart for-Schleife
		for (int value : werte) {
			System.out.println(value);
		}
		System.out.println();
		//while-Schleife, die jeden Wert des werte Arrays ausgibt
		int index = 0;
		while(index < werte.length) {
			System.out.println(werte[index]);
			index++;
		}
		System.out.println();
		//do while Schleife, die jeden Wert des werte Arrays ausgibt
		//Vorsicht: Array muss mindestens ein Element enthalten, ansonsten
		//gibt es eine ArrayIndexOutOfBoundsException (da die Überprüfung, ob
		//der Index sich im Bereich des Arrays befindet, erst nach dem ersten
		//Durchlauf des Schleifenbodys statt findet)
		index = 0;
		do {
			System.out.println(werte[index]);
			index++;
		} while(index < werte.length);
	}
}