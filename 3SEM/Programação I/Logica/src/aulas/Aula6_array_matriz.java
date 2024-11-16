package aulas;

public class Aula6_array_matriz {

	public static void main(String[] args) {
		/*
		 *  int[] nota = new int[3];
		 *  nota[0] = 9; 
		 *  nota[1] = 10;
		 *   nota[2] = 7;
		 */
		
		int[] nota = {9,10,7};
		
		for (int i = 0; i < nota.length; i++) {
			System.out.println(nota[i]);
		}
		for(int valor:nota) {
			System.out.println(valor);			
		}
		
		int[][] matriz = new int[2][2];
		
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[1][0] = 3;
		matriz[1][1] = 4;
		
		System.out.println("---");
		for (int i = 0; i < 2 ; i++) {
			for(int j=0; j <2; j++) {
			System.out.println(matriz[i][j]);
			}
		}
		
		System.out.println("---");
		
		int[][] matriz2 = {{5,6},{7,8}};
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.println(matriz2[i][j]);
			}
		}


	}

}
