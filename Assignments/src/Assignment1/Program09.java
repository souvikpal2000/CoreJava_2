package Assignment1;

import java.io.*;
public class Program09 {
	static float chargeAmount(int charges) {
		float totalCharge;
		if(charges <= 500) {
			totalCharge = (float) (0.0025 * charges);
		}else if(charges > 500 && charges <= 1500) {
			totalCharge=(float) (500*0.0025+ (charges-500)*0.005);
		}else if(charges > 1500 && charges <= 2500) {
			totalCharge=(float) (500*0.0025+ 1000*0.005+ (charges-1500)*0.0075);
		}else {
			totalCharge=(float) (500*0.0025+ 1000*0.005+ 1000*0.0075+ (charges-2500)*0.01);
		}
		return totalCharge;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the Amount : ");
		int n = Integer.parseInt(br.readLine());
		float result = Program09.chargeAmount(n);
		System.out.println("Charges Amount : "+result);
	}

}
