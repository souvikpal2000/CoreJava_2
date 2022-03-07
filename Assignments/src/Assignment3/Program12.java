package Assignment3;

import java.io.*;
public class Program12 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Enter Number of Terms : ");
		int row = Integer.parseInt(br.readLine());
		int[][] arr = new int[row][row];
		int i,k,j,l=row;
		for (i=0;i<row;i=i+1) {
	    	k=0;
			while(k<l){
				System.out.print(" ");
				k++;
			}
	        for (j=0;j<=i;j=j+1) {
	        	if (i==j || j==0){
	            	arr[i][j] = 1;
				}else{
	            	arr[i][j] = arr[i-1][j-1] +  arr[i-1][j];
	        	}
	        	System.out.print(arr[i][j]+" ");
			}
			l--;
			System.out.println("");
		}
	}
}
