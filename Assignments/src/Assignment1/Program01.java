package Assignment1;
public class Program01 {
	static int calMax(int x,int y,int z) {
		int max = 0;
		if(x > y && x > z)
			max = x;
		else if(y > x && y > z)
			max = y;
		else if(z > x && z > y)
			max = z;
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Maximum No : "+calMax(5,10,6));
	}	

}