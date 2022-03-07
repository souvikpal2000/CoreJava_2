package Assignment2;

public class Program03 {
	static int findPosition(int num, int[] nos) {
        for (int i=0; i<nos.length; i++)  {
          if (nos[i] == num)  {
        	System.out.println("Element found at : ");
            return i;
          }
        }
        return -1;
    }
    public static void main(String[] args){
        int n=7;
        int[] numbers={2,8,3,1,5,7,0};
        System.out.println(findPosition(n,numbers));
    }

}
