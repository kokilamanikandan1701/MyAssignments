package week3.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String test ="chengeme";
  char[] charAt=test.toCharArray();
		for(int i=0;i<charAt.length;i++)
		{
			if(i%2!=0)
			{
				charAt[i]=Character.toUpperCase(charAt[i]);
			}
			
		}
		System.out.println(new String(charAt));
	}

}
