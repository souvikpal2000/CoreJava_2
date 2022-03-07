package Assignment3;

import java.io.*;
public class Program07 {
	public static void sortArray(int[] arr, int n) {
		int temp=0;
		for(int i=0;i<n-1;i++) {
			for(int j=(i+1);j<n;j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Sorted in Descending Order : ");
		for(int i=0;i<n;i=i+1) {
			System.out.print(arr[i]+" ");
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
		sortArray(arr,n);
	}

}
