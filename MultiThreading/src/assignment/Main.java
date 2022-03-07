package assignment;

import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String args[]) throws IOException, InterruptedException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter Number of Counters :");
        int n = Integer.parseInt(br.readLine());
        List<AlphaCount> l = new ArrayList<>();
        for(int i=0;i<n;i=i+1){
            System.out.println("Enter text for counter "+(i+1)+" :");
            String line = br.readLine();
            AlphaCount ac = new AlphaCount(line);
            l.add(ac);
            ac.start();
            ac.join();
        }
        int k = 1;
        for(AlphaCount m : l){
            System.out.println("Counter "+k+" Result :");
            m.mp.forEach((key, value) -> {
                System.out.print(key+":"+value+" ");
            });
            
            System.out.println("");
            k++;
        }
    }
}      