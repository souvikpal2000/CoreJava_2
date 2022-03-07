package Assignment1;

import java.io.*;

public class Program08 {
	static double calculateBill( String connectionType, int consumedUnits) {
		double result = 0;
		if(connectionType.equalsIgnoreCase("domestic")) {
			if(consumedUnits <= 100) {
				result = max(250, 4 * consumedUnits);
			}else if(consumedUnits > 100 && consumedUnits <= 300) {
				result = 4.5 * consumedUnits;
			}else if(consumedUnits > 300 && consumedUnits <= 500) {
				result = 4.75 * consumedUnits;
			}else if(consumedUnits > 500) {
				result = 5 * consumedUnits;
			}
		}else if(connectionType.equalsIgnoreCase("domestic")) {
			if(consumedUnits <= 100) {
				result = max(350, 4.25 * consumedUnits);
			}else if(consumedUnits > 100 && consumedUnits <= 300) {
				result = 4.75 * consumedUnits;
			}else if(consumedUnits > 300 && consumedUnits <= 500) {
				result = 5 * consumedUnits;
			}else if(consumedUnits > 500) {
				result = 5.25 * consumedUnits;
			}
		}else {
			System.out.println("Incorrect Connection Type");
		}
		return result;
	}
	public static double max(double i, double j) {
		double max = 0;
		if(i>j)
			max = i;
		else
			max = j;
		return max;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("");
		System.out.print("Enter Connection Type : ");
		String type = br.readLine();
		System.out.print("Enter Unit Consumed : ");
		int units = Integer.parseInt(br.readLine());
		double result = Program08.calculateBill(type, units);
		System.out.println("Payble Amount : "+result);
	}

}
