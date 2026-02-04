package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="We learn Java basics as part of java sessions in java week1";
		int count=0;
		String[] words=text.split(" ");
		for(int i=0;i<words.length;i++)
		{
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equalsIgnoreCase(words[j]) && !words[i].equals(""))
				{
					words[j]=" ";
					count++;
				}
			}
		}
		if(count>1)
		{
			System.out.println("Modified words array:");
			for(int i=0;i<words.length;i++)
			{
				System.out.println(words[i]+"");
			}
		}
			else
			{
				System.out.println("Duplicate word not found");
			}
		}
		
	}


