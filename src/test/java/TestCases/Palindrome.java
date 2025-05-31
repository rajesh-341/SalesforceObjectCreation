package TestCases;


public class Palindrome 
{

	public static void main(String[] args) 
	{			
		int[] input = {4,5,7,8};
		
		int[] input2 = {5,6,7,8};
		
		int index = input.length-1;
		
		boolean isNotaPalindrome = true;
		
		for (int i = 0 ; i < input.length ; i++)
		{						
			input2[i] = input[index-i];			
	
			if(input[i] == input2[i])
			{
				System.out.println(input[i]+","+input2[i]+"It is palindrome");
			}	
			else
			{
				isNotaPalindrome = false;
			}
			
			if(!isNotaPalindrome)
			{
				System.out.println("It is not a palindrome");
			}				
		}	
	}
}
