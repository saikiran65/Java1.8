package in.ashokit;

import java.util.Scanner;

public class HEDoubleDimArray {
	
	public static void main(String[] args) {
		
		Scanner scn1 = new Scanner(System.in);
        int test = Integer.valueOf(scn1.nextLine());

     while(test!=0){
        Scanner scn2 = new Scanner(System.in);
        int m = Integer.valueOf(scn2.nextLine());
        int n = m;

        int[][] mat = new int[m][n];

        
        for(int i=0; i<n; i++){
            int sindex = 0;
            Scanner scn3 = new Scanner(System.in);
            String[] s1 = scn3.nextLine().split(" ");
            for(int j=0; j<n; j++){
                mat[i][j] = Integer.valueOf(s1[sindex]);
                sindex++;
            }
        }    


            int count = 0;
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    for(int p=0; p<3; p++){
                        for(int q=0; q<3; q++){
                            if(i<=p&&j<=q){
                                if(mat[i][j] > mat[p][q]){
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(count);
            test--;
        }
	}

}
