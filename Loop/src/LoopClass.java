
public class LoopClass {

	public static void main(String[] args) {
	
		for (int i=1; i<=5; i ++)
		{
		    for (int j=0; j<i; j++)
		    {
		        System.out.print("1" + " ");
		    }
		    System.out.println("");
		}
System.out.println();

		int rows = 5;

		for (int i=rows; i>=1; --i)
		{
			for (int j=0; j<i; ++j)
			{
				 System.out.print("1"+ " ");
		    }
		    System.out.println("");
			}
		System.out.println();
		
	
		for (int i=1; i<=5; i ++)
		{
			int k= 1;
			
		    for (int j=1; j<i; j++)
		    {
		    	
		        System.out.print(k + " ");
		        k=k+2; 
		    }
		      System.out.println();
		}
	
	System.out.println();
	
		   

				for (int i=5; i>=1; --i)
				{
					int  l=2;
					for (int j=0; j<i; ++j)
					{
						 System.out.print(l+ " ");
						 l= l+2;
				    }
				    System.out.println("");
					}
				 
				}
	
		}
		
	


