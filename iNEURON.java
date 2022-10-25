package king.java;

public class iNEURON{

	public static void main(String[] args) {
		int n=12;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0&&j==n/2||j==n/2&&i>2)
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
				if(j==1||i==j-1&&i>0&&j<=n-1||j==n-1)
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
				if(j==2||i==0&&j<(3*n)/4&&j>2||i==(n-1)/2&&j<(3*n)/4&&j>2||i==n-1&&j<(3*n)/4&&j>2)
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
				if(j==2&&i<n-1||j==n-1&&i<n-1||i==n-1&&j>2&&j<n-1)
				   {
				     System.out.print("%");
				   }
				else
				   {
				     System.out.print(" ");
				   }
			}
			for(int j=0;j<n;j++)
			{
				if(j==3||i==0&&j>3&&j<=(n-1)||j==(n-1)&&i<=(n-1)/2&&i>0||i==(n-1)/2&&j<(n-1)&&j>3||i-j==n/4&&j>3&&i>(n-1)/2)
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
				if(j==2||j==n-1||i==0&&j>2&&j<n-1||i==n-1&&j>2&&j<n-1)
				   {
				     System.out.print("*");
				   }
				else
				   {
				     System.out.print(" ");
				   }
			}
			for(int j=0;j<n;j++)
			{
				if(j==2||i==j-1&&i>0&&j<=n-1||j==n-1)
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