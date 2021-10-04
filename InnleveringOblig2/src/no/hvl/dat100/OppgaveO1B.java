package no.hvl.dat100;

public class OppgaveO1B {

	public static void main(String[] args) {
		int[][] matrise = {{1,6,3,6},{5,2,6,3},{1,6,3,7,8,3},{3,7,2,9,2}};
		skrivUtv1(matrise);
		System.out.println();
		System.out.println(tilStreng(matrise));
		
		System.out.println();
		
		int[][] skalerMatrise = skaler(5, matrise);
		skrivUtv1(skalerMatrise);
		
		System.out.println();
		
		int[][] matrise1 = {{1,6,3,6},{5,2,6,3},{1,6,3,7,8,3},{3,7,2,9,2}};
		int[][] matrise2 = {{1,6,3,6},{5,2,6,3},{1,6,3,7,8,3},{3,7,2,9,2}};
		
		System.out.println(erLik(matrise1, matrise2));
		
		System.out.println();
		
		int[][] originalMatrise = {{1,0,0,0,1},{0,1,1,1,0},{1,0,1,0,1},{0,1,1,1,0},{1,0,0,0,1}};
		skrivUtv1(originalMatrise);
		
		System.out.println();
		
		int[][] speiletMatrise = speile(originalMatrise);
		skrivUtv1(speiletMatrise);
		
		System.out.println();
		
		int[][] matriseA = {{1,3,2,4},{1,3,2,6}};
		int[][] matriseB = {{6,2,6,1},{5,2,9,3}};
		
		int[][] nyMatrise = multipliser(matriseA, matriseB);
		skrivUtv1(nyMatrise);
	}

	public static void skrivUtv1(int[][] matrise) {
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public static String tilStreng(int[][] matrise) {
		String tekst = "";
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				tekst += matrise[i][j] + " ";
				if(j == matrise[i].length-1) {
					tekst += "/n";
				}
			}
		}
		return tekst;
	}
	
	public static int[][] skaler (int tall, int[][] matrise) {
		int[][] ny = matrise;
		for(int i = 0; i < ny.length; i++) {
			for(int j = 0; j < ny[i].length; j++) {
				ny[i][j] = ny[i][j]*tall;
			}
		}
		return ny;
	}
	
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		if(mat1.length != mat2.length) {
			return false;
		}
		
		for(int i = 0; i < mat1.length; i++) {
			if(mat1[i].length != mat2[i].length) {
				return false;
			}
			for(int j = 0; j < mat1[i].length; j++) {
				if(mat1[i][j] != mat2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static int[][] speile (int [][] matrise) {
		int[][] speilet = new int[matrise.length][matrise[1].length];
			for(int i = 0; i < matrise.length; i++) {
				for(int j = 0; j < matrise[i].length; j++) {
					speilet[i][j] = matrise[j][i];
				}
			}
		return speilet;
	}

	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] ny = new int[a.length][a[0].length];
		if(a.length != b.length) {
			return ny;
		}
		for(int i = 0; i < ny.length; i++) {
			if(a[i].length != b[i].length) {
				return ny;
			}
			for(int j = 0; j < ny[i].length; j++) {
				ny[i][j] = a[i][j]*b[i][j];
			}
		}
		return ny;
	}
}
