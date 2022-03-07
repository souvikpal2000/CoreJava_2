package Assignment3;

import java.io.*;
public class Program13 {
	public static int lowerTraingle(int[][] arr, int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(arr[i][j]+" ");
				sum = sum + arr[i][j];
			}
			System.out.println("");
		}
		return sum;
	}
	public static int upperTraingle(int[][] arr, int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int k=0;k<i;k++) {
				System.out.print("  ");
			}
			int l = i;
			for(int j=0;j<n;j++) {
				//System.out.println(l);
				if(l==n) {
					break;
				}
				System.out.print(arr[i][l]+" ");
				sum = sum + arr[i][l];
				l++;
			}
			System.out.println("");
		}
		return sum;
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int n;
		System.out.print("Enter Number of Terms : ");
		n = Integer.parseInt(br.readLine());
		System.out.println("");
		int[][] arr = new int[n][n];
		System.out.println("Enter Numbers : ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("arr["+i+"]["+j+"] : ");
				arr[i][j] = Integer.parseInt(br.readLine());
			}
			System.out.println("");
		}
		System.out.println("");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("");
		int sum1 = lowerTraingle(arr,n);
		System.out.println("");
		int sum2 = upperTraingle(arr,n);
		System.out.println("");
		System.out.println("Lower Triangle Matrix Sum : "+sum1);
		System.out.println("Upper Triangle Matrix Sum : "+sum2);
	}

}
