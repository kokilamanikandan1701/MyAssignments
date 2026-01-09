package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=13;
 
	for(int a=1;a<=n;a++)
		{
			boolean isPrimeNumber=true;
			for(int i=2;i<a;i++)
			{
				if(a%i==0)
				{
					isPrimeNumber=false;
					break;
				}
			}
	if(isPrimeNumber)
	{
		System.out.println(a);
	
	}
}
}

}
