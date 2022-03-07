package assignment;

import java.util.*;
import java.util.stream.Collectors;
//Fill code here 
import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException{
        //Fill code here
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        System.out.println("Enter number of bookings");
        int n = Integer.parseInt(br.readLine());

        ArrayList<TicketBooking> lists = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("Enter customer name");
            String name = br.readLine();
            System.out.println("Enter number of tickets");
            int tickets = Integer.parseInt(br.readLine());
            System.out.println("Enter the price");
            double price = Double.parseDouble(br.readLine());
            
            TicketBooking ob = new TicketBooking(name, tickets, price);
            lists.add(ob);
        }
        Comparator<TicketBooking> comp = (ob1, ob2) -> {
            return (int) (ob1.getPrice() - ob2.getPrice());
        };
        ArrayList<TicketBooking> sortedList = (ArrayList<TicketBooking>) lists.stream().sorted(comp).collect(Collectors.toList());
        System.out.format("%-10s %-15s %-15s\n", "Customer", "No Of Tickets", "Price");
        sortedList.forEach((l) -> {
            System.out.println(l);
        });
    }
}

