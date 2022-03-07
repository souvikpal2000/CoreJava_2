package Assignment2;

import java.util.*;
public class Program08 {
	public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Tictac Function returns "+tictac());
    }
    static char tictac() 
    {
        char arr[][]=new char[3][3];
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter X's or O's: "); 
        for(int i=0;i<3;i++) 
        {
            for(int j=0;j<3;j++) 
            {
                arr[i][j]=sc.next().charAt(0);
                if(arr[0][0]==arr[1][1] && arr[1][1]==arr[2][2] && i==2) 
                {
                    return arr[0][0];
                }
                if(arr[0][2]==arr[1][1] && arr[1][1]==arr[2][0] && i==2) 
                {
                    return arr[0][0];
                }
            }
        }
        return 'N';
    }

}
