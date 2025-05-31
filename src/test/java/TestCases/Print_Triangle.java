package TestCases;

public class Print_Triangle {

	public static void main(String[] args) 
	{
		
		int length = 9;
		String[] Input = new String[20];		
		int k = length-2;
		
		for(int i=0 ; i < length; i++)
		{					
			Input[i] = "*";				
			System.out.print(" ".repeat(i)+Input[i] + " ");	
			
			for(int j = 1 ; j < length; j++)
			{					
				Input[j] = "*";				
				if(i == 0)
				{
					System.out.print(Input[j] + " ");
				}			
				else 
				if(j >= 1 && j <= k)
				{						
					System.out.print(Input[j] + " ");
				}				
			}
			if(i > 0)
			{
				k--;
			}				
			System.out.println("");
		}
	}
}

