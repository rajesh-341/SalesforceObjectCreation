package TestCases;

public class PrintXShape {

	private static int length = 15;
	
	public static void InvertedTriangle()
	{
		{			
			String[] Input = new String[20];
			int k = 1;
			int repeat = length-1;
			
			for(int i=0 ; i < length; i++)
			{					
				Input[i] = "*";		
				if(i > 0)
				{	
					System.out.print(" ".repeat(repeat)+Input[i] + " ");	
				}								
				for(int j = 1 ; j < length; j++)
				{					
					Input[j] = "*";	
					
					if( i > 0 && j >= 1 && j <= k)
					{
						System.out.print(Input[j] + " ");
					}								
				}
				
				if(i > 0)
				{
					k++;	
				}
				
				repeat = repeat-1;
			System.out.println("");
		}
		}
	}
	
	
	
	public static void main(String[] args) 
	{
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
				
				if(j == length - 2 && i == length-1)
				{
					InvertedTriangle();
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
