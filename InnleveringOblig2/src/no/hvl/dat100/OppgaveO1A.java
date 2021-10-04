package no.hvl.dat100;

public class OppgaveO1A {

	public static void main(String[] args) {
		int[] table = {42,67,89};
		skrivUt(table);
		String tekst = tilStreng(table);
		System.out.println(tekst);
		System.out.println(summer1(table));
		System.out.println(summer2(table));
		System.out.println(summer3(table));
		System.out.println(finnesTall(table, 41));
		System.out.println(posisjonTall(table, 89));
		
		int[] reversetable = reverser(table);
		skrivUt(reversetable);
		
		System.out.println(erSortert(table));
		
		int[] table2 = {5,72,75,1};
		int[] sattSammen = settSammen(table, table2);
		skrivUt(sattSammen);
	}

	public static void skrivUt (int[] tabell) {
		for(int elem : tabell) {
			System.out.println(elem);
		}
	}
	
	public static String tilStreng (int[] tabell) {
		String tekst = "[";
		for(int i = 0; i < tabell.length; i++) {
			tekst += tabell[i];
			if(i == tabell.length-1) {
				
			}
			else {
				tekst += ",";
			}
		}
		return tekst + "]";
	}
	
	public static int summer1 (int[] tabell) {
		int sum = 0;
		for(int i = 0; i < tabell.length; i++) {
			sum = sum + tabell[i];
		}
		return sum;
	}
	
	public static int summer2 (int[] tabell) {
		int i = 0;
		int sum = 0;
		while(i < tabell.length) {
			sum = sum + tabell[i];
			i++;
		}
		return sum;
	}
	
	public static int summer3 (int[] tabell) {
		int sum = 0;
		for(int elem : tabell) {
			sum = sum + elem;
		}
		return sum;
	}
	
	public static boolean finnesTall (int[] tabell, int tall) {
		boolean finnes = false;
		for(int elem : tabell) {
			if(elem == tall) {
				finnes = true;
			}
		}
		return finnes;
	}
	
	public static int posisjonTall (int[] tabell, int tall) {
		int posisjon = -1, i = 0;
		do {
			if(tabell[i] == tall) {
				posisjon = i;
			}
			i++;
		}while(i < tabell.length && posisjon == -1);
		return posisjon;
	}
	
	public static int[] reverser (int[] tabell) {
		int[] reverseTabell = new int[tabell.length];
		for(int i = 0; i < tabell.length; i++) {
			reverseTabell[tabell.length-1-i] = tabell[i];
		}
		return reverseTabell;
	}
	
	public static boolean erSortert (int[] tabell) {
		boolean sortert = true;
		int i = 1;
		do {
			if(tabell[i] < tabell[i-1]) {
				sortert = false;
			}
			i++;
		}while(sortert && i < tabell.length);
		return sortert;
	}
	
	public static int[] settSammen (int[] tabell1, int[] tabell2) {
		int[] ny = new int[tabell1.length + tabell2.length];
		for(int i = 0; i < tabell1.length; i++) {
			ny[i] = tabell1[i];
		}
		for(int i = 0; i < tabell2.length; i++) {
			ny[tabell1.length+i] = tabell2[i];
		}
		return ny;
	}
}
