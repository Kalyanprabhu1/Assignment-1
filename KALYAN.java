package king.java;

public class KALYAN{
   
	public static void main(String[] args)
	{
		int n=12;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||i+j==(n)/2||i-j==(n)/2)
				   {
				     System.out.print("@");
				   }
				else
				   {
				     System.out.print(" ");
				   }
			}
			for(int j=0;j<n;j++) 
			{
				if(i==0||j==0&&i>0||j==n-1&&i>0||i==n/2) 
		    	  {
		    		  System.out.print("#");
		    	  }
		    	else 
		    	  {
		    		  System.out.print(" ");
		    	  }
		     }
			 for(int j=0;j<n;j++)
			 {
				 if(j==2||i==n-1&&j>1)
			      {
					System.out.print("$"); 
				  }
			    else 
			      {  
				     System.out.print(" ");
			      }
			 }
			 for(int j=0;j<n;j++)
			  {
				 if((i==j&&i<=(n-1)/2&&j<=(n-1)/2)||i+j==n-1&&i<=6&&j>6||j==(n-1)/2&&i>=6)
			      {
					System.out.print("Y"); 
				  }
			    else 
			      {  
				     System.out.print(" ");
			      }
			  }
			  for(int j=0;j<n;j++)
			  {
				 if(i==0&&j>=1||j==1&&i>0||j==n-1&&i>0||i==n/2&&j>1)
			      {
					System.out.print("&"); 
				  }
			    else 
			      {  
				     System.out.print(" ");
			      }
			  }
			  for(int j=0;j<n;j++)
			  {
				 if(j==2||i==j-1&&i>2&&j<n-2||j==n-1)
			      {
					System.out.print("%"); 
				  }
			    else 
			      {  
				     System.out.print(" ");
			      }
			  }
		      System.out.println();
		}
	}
}
	


