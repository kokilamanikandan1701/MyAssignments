package week3.day1;

import java.util.Arrays;

public class FindMissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] number= {1, 4,3,2,8, 6, 7};
Arrays.sort(number);
for(int i=0;i<number.length;i++)
{
	if(number[i]!=i+1)
	{
		System.out.println("Missing Number is:"+(i+1));
		break;
	}
}
	}

}
