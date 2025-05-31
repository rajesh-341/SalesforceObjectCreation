package TestCases;

public class InvertedTriangle {

	public static void main(String[] args) 
	{
		{			
			int length = 9;
			String[] Input = new String[20];
			int k = 1;
			
			int repeat = length;
			
			
			for(int i=0 ; i < length; i++)
			{					
				Input[i] = "*";		
				
				System.out.print(" ".repeat(repeat)+Input[i] + " ");	
												
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

}
