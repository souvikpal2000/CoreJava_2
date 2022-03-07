package Assignment2;

import java.util.*;
public class Program02 {
	public static void main(String[] args) 
    {
       Scanner scanner=new Scanner(System.in);
       String a[]= initProductNames();
       System.out.println("Enter the keyword : ");
       String k=scanner.nextLine();
       System.out.println("Result : "+isPresent(a,k));
       scanner.close();
    }
    static String[] initProductNames() 
    {

       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of products : ");
       int n=sc.nextInt();
       sc.nextLine();
       String s[]=new String[n];
       for(int i=0; i<n; i++)
       {
         System.out.println("Enter product name : "+(i+1));
         s[i]=sc.nextLine();
       }
       return s;
    }
    static boolean isPresent(String[] productNames, String keyword)
    {
        for(String i:productNames)
        {
           if(i.contains(keyword))
           return true;
        }
        return false;
    }

}
