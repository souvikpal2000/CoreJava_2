package Assignment3;

import java.io.*;
public class Program10 {
	public static void displayArray(int[] arr, int n) {
		System.out.print("Array : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] insertArray(int[] arr, int n, int pos, int no){
		for(int i=0;i<n;i++) {
			if(i == pos) {
				for(int j=(n-1);j>=pos;j--) {
					arr[j+1] = arr[j];
				}
				arr[pos] = no; 
			}
		}
		return arr;
	}
	public static int[] deleteArray(int[] arr, int n, int pos) {
		for(int i=0;i<n;i=i+1) {
			if(i==pos) {
				for(int j=pos;j<n;j++) {
					arr[j] = arr[j+1];
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Enter Size of Array : ");
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[100];
		System.out.println("Enter Numbers : ");
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("");
		displayArray(arr,n);
		System.out.println("\n");
		
		int pos;
		System.out.print("Enter Position of Insertion : ");
		pos = Integer.parseInt(br.readLine());
		System.out.print("Enter Number to be Inserted : ");
		int no = Integer.parseInt(br.readLine());
		System.out.println("");
		int[] newArray = insertArray(arr,n,pos-1,no);
		System.out.println("After Insertion : ");
		displayArray(newArray,n+1);
		System.out.println("\n");
		
		System.out.print("Enter Position to be Deleted : ");
		pos = Integer.parseInt(br.readLine());
		System.out.println("");
		int[] newArray2 = deleteArray(arr,n,pos-1);
		System.out.println("After Deletion : ");
		displayArray(newArray2,n);
	}

}
