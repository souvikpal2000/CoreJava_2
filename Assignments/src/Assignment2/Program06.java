package Assignment2;

import java.util.*;
public class Program06 {
	public void findPrime()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Lower Range : ");
        int l=sc.nextInt();
        System.out.println("Enter the Upper Range : ");
        int u=sc.nextInt();
        printmethod(l,u);
        sc.close();
    }
    public ArrayList<Integer> printmethod(int lo,int upp)
    {
        int flag,i,j;
        ArrayList<Integer> a=new ArrayList<>();
        for( i=lo; i<=upp; i++)
        {
            if (i == 1 || i == 0)
            continue;
            flag = 1;
            for ( j = 2; j <= i / 2; ++j) 
            {
                if (i % j == 0) 
                {
                    flag = 0;
                    break;
                }
            }
        if (flag == 1)
        {
            System.out.print(i+" ");
            a.add(i);
        }
        }
        return a;
    }
    public static void main(String[] args)
    {
        Program06 p= new Program06();
        p.findPrime();
    }
}
