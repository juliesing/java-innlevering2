package no.hvl.dat100.matriser;

public class Matriser {

	// a) 
	public static void skrivUt(int[][] matrise) {
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j] + " ");
				
			}
			System.out.println();
		}
		
	}

	// b) 
	public static String tilStreng(int[][] matrise) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                sb.append(matrise[i][j]);
                if (j < matrise[i].length) {
                    sb.append(" ");  
                }
            }
            
            sb.append("\n"); 
        }
        
        return sb.toString();
    }


	// c) 
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] resultat = new int[matrise.length][matrise[0].length];
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				resultat[i][j] = matrise[i][j] * tall;
				
			}
		}
		
		return resultat;
	
	}

	// d) 
	public static boolean erLik(int[][] a, int[][] b) {
		
	        if (a.length != b.length) {
	            return false; 
	        }
	        
	        for (int i = 0; i < a.length; i++) {
	          
	            if (a[i].length != b[i].length) {
	                return false; 
	            }
	         
	            for (int j = 0; j < a[i].length; j++) {
	                if (a[i][j] != b[i][j]) {
	                    return false; 
	                }
	            }
	        }
	        
	        return true; 
	    
			}
		}	
	