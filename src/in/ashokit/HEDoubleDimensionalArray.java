package in.ashokit;

public class HEDoubleDimensionalArray {
	
	public static void main(String[] args) {
		
		int[][] m = {{2,0,1},{0,1,0},{3,4,5}};
		
		/*
		 * int p=0; for(int i=0; i<3; i++) { for(int j=0; j<3; j++) { m[i][j] = p++; } }
		 */
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		
		
		int count=0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<3; k++) {
					for(int l=0; l<3; l++) {
						if(k>=i && l>=j) {
							if(m[i][j]>m[k][l]) {
								count++;
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}

}
