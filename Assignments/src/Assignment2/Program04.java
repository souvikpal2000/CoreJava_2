package Assignment2;

public class Program04 {
	public static String makeReverse(String str) {
        StringBuffer s=new StringBuffer(str);
        str= s.reverse().toString();
        String[] rev=str.split(" ");
        StringBuffer s1= new StringBuffer();
        for(int i=rev.length-1; i>=0; i--)  {
            s1.append(rev[i]).append(" ");
        }
        return s1.toString();
    }
    public static void main(String[] args){
        String text = "To be or not to be";
        System.out.println(makeReverse(text));
    }

}
