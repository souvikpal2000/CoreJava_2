package Assignment2;

import java.util.*;
public class Program07 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        String num = sc.nextLine();
        String [] res = getCombinations(num);
        System.out.println("The combinations are : ");
        for(String s: res){
            System.out.println(s);
        }
        sc.close();
    }
    static String[] getCombinations(String str)  {
        ArrayList<String> s = new ArrayList<String>();
        if(str.length() == 0) {
            s.add("");
        }
        else {
            String first = str.substring(0,1);
            String rem = str.substring(1);
            String [] words = getCombinations(rem);
            for(String w : words) {
                for(int i = 0; i <= w.length(); i++)  {
                    s.add(w.substring(0,i) + first + w.substring(i));
                }
            }
        }
        String[] result = new String[s.size()];
        result = s.toArray(result);
        return result;
    }

}
