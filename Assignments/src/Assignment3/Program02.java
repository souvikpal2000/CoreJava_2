package Assignment3;

import java.io.*;
public class Program02 {
	public static int findThirdMax(int[] arr){
		int firstMax = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > firstMax) {
				firstMax = arr[i];
			}
		}
		
		int secondMax = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > secondMax && arr[i] < firstMax) {
				secondMax = arr[i];
			}
		}
		
		int thirdMax = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > thirdMax && arr[i] < secondMax) {
				thirdMax = arr[i];
			}
		}
		
		return thirdMax;
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		int n;
		while(true) {
			System.out.print("Enter Size of Array : ");
			n = Integer.parseInt(br.readLine());
			if(n<3) {
				System.out.println("Invalid Size");
				continue;
			}else {
				break;
			}
		}
		System.out.println("");
		int[] arr = new int[n];
		System.out.println("Enter Numbers : ");
		for(int i=0;i<n;i=i+1) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("");
		
		int thirdMax = findThirdMax(arr);
		System.out.println("Third Largest Number in Array : "+thirdMax);
	}

}
