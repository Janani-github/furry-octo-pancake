
import java.util.Scanner;

class SplitNumModify
{
	public static void main(String[] args)
	{
		int n;
		Scanner s = new Scanner(System.in);
        	System.out.print("Enter no. of elements you want in array:");
		n=s.nextInt();
		
		for(int i = 1; i <= n; i++)
       		{
			String str=String.valueOf(i);
		
			int length=str.length();
			int sum=0;
			boolean flag=false;
		 	for(int j = 0; j<length; j++)
			{
				char C=str.charAt(j);
				int k=Character.getNumericValue(C);
				sum=sum+k;
				if(j!=0){
					if(k>Character.getNumericValue(str.charAt(j-1)))
					{
						flag=true;
					} else {

						flag=false;
						break;
						}
					}
			}
			if (flag && sum==9)
			{
				System.out.println(i);
		}	}
	}
}	