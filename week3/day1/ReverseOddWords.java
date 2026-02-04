package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] reverse=test.split(" ");
		// System.out.print("\nEven position words in reverse order:\n");
		 for (int i=0;i<reverse.length;i++) {
	            if (i%2!=0) { 
	                String reversed=" ";
	                for (int j= reverse[i].length()-1;j>=0;j--) {
	                    reversed+= reverse[i].charAt(j);
	                }
	                System.out.print(reversed+" ");
	            } else { 
	                System.out.print(reverse[i]+" ");
	            }

		}
	}
}

	


