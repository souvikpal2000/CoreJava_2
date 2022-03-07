package Assignment2;

public class Program05 {
    public void findandreplace()
    {
        String Str = new String("Welcome to Persistent Systems Limited");
        System.out.print("\nAfter replacing all o with T : ");
        System.out.println(Str.replace('o', 'T'));
        System.out.print("\nAfter replacing all e with D : ");
        System.out.println(Str.replace('e', 'D'));
    }
    public static void main(String[] args)
    {
    	Program05 r= new Program05();
        r.findandreplace();
    }    
}
