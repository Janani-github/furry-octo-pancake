import java.io.*;

class durga2
{	
	public static void main(String x[])throws IOException
	
	{
		DataInputStream b=new DataInputStream(System.in);
	
		System.out.println("Enter your Reg id");
		int id=Integer.parseInt(b.readLine());
	
		int a[]=new int[6];
	
		System.out.println("Enter 6 marks:");
		int c=Integer.parseInt(b.readLine());
			
		System.out.println("Marks of" +id);
		for(int i=1;i<6;i++)
			{
			System.out.println(a[i]);
			}
	}
}