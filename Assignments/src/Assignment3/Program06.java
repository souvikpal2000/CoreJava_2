package Assignment3;

import java.io.*;
public class Program06 {
	public static void removeDuplicates(int[] arr, int n) {
		int k=0;
		int[] temp = new int[n];
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count==1) {
				temp[k] = arr[i];
				k++;
			}
		}
		System.out.print("Array after Removing Duplicates : ");
		for(int i=0;i<k;i++) {
			System.out.print(temp[i]+" ");
		}
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Enter Size of Array : ");
		int n = Integer.parseInt(br.readLine());
		System.out.println("Enter Numbers : ");
		int[] arr = new int[n];
		for(int i=0;i<n;i=i+1) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("");
		removeDuplicates(arr,n);
	}

}
