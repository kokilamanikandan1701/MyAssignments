package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		int fn=0;
		int sn=1;
		int n=10;
		System.out.print("Fibonacci Series: ");
		for(int i=1;i<=n;i++)
		{
			System.out.println(fn);
			int tn=fn+sn;
			fn=sn;
			sn=tn;
		}
	}
}