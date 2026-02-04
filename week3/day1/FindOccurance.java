package week3.day1;

public class FindOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input="TestLeaf";
		 char target='e';
		 int count=0;
		 char[] charInput=input.toCharArray();
		 for(int i=0;i<charInput.length;i++)
		 {
			 if(charInput[i]==target)
			 {
				count++; 
			 }
		 }
		 System.out.println("Character'" +target+ "'occurs " +count+ " times");
	}
	}


