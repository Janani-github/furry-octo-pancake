import java.io.*;

class splitnum
{

	public static void main(String[] args)throws IOException
	{
		DataInputStream dis=new DataInputStream(System.in);
		
		int first,second,sum; 
		System.out.print("Enter the two digit numbers:");
		first=Integer.parseInt(dis.readLine());
		
		second=first%10;
		first = first / 10;
	
		sum=first+second;
		
		if(first<second & first!=0)
		{
			if(sum==9)
			{
				System.out.println("correct number");
			}

			else
			{
				System.out.println("Incorrect number");
			}
		}
		else
			{
				System.out.println("Incorrect number");
			}
	}
}