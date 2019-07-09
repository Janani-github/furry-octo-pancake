
import java.util.Scanner;

class splitnum1
{

	public static void main(String[] args)
	{
		int n;
		Scanner s = new Scanner(System.in);
        	System.out.print("Enter no. of elements you want in array:");
        	n= s.nextInt();
		
		for(int i = 1; i <= n; i++)
       		 {
		int second=i%10;  
		int first =i/10;
		int sum=first+second;
		
		if(first<second & first!=0)
		{
			if(sum==9)
			{
				System.out.println(i);
			}

		}
		}
	}
}